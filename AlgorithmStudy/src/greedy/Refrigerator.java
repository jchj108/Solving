package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Refrigerator {

	static int N;
	static int[][] temperature;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		temperature = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int min = Integer.parseInt(st.nextToken());
			int max = Integer.parseInt(st.nextToken());
			temperature[i][0] = min;
			temperature[i][1] = max;
		}
		
		Arrays.sort(temperature, new Comparator<int[]>() { // 최고 온도 기준 오름차순 정렬
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		
		int prevMax = temperature[0][1];
		int count = 1;
		
		for(int i = 1; i < temperature.length; i++) {
			if(prevMax < temperature[i][0]) { // 
				count++;
				prevMax = temperature[i][1];
			}
		}
		System.out.println(count);
	}
}
