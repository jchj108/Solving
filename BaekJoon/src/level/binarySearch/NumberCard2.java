package level.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class NumberCard2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			bw.write(binarySearch(Integer.parseInt(st.nextToken()), arr));
		}
	}

	private static int binarySearch(int num, int[] arr) {
		
		int left = 0;
		int right = arr.length - 1;
		int count = 0;
		
		while(left <= right) {
			int center = (left + right) / 2;
			if(center == num) {
				return num;
			}
		}
		
		return 0;
	}
}
