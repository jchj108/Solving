package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Scale {
	
	static int N;
	static int[] weights;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		weights = new int[N];
		
		for(int i = 0; i < N; i++) {
			weights[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(weights);
		
		int result = 0;
		
		if(weights[0] != 1) {
			result = 0;
		} else {
			for(int i = 0; i < weights.length; i++) { // 정렬한 뒤 앞의 무게를 더한 값이 다음 무게보다 작다면 다음부터는 조합할 수 없다. 
				if(result+1 < weights[i]) {
					break;
				}
				
				result += weights[i];
			}
		}
		System.out.println(++result);
	}
}
