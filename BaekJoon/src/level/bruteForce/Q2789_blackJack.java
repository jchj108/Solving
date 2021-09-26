package level.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2789_blackJack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 카드의 개수
		int M = Integer.parseInt(st.nextToken()); // 근접해야 하는 수

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(arr, N, M);
		System.out.println(result);
		
	}

	private static int search(int[] arr, int N, int M) {
		int result = 0;
		for(int i = 0; i < N - 2; i++) {
			for(int j = i +1; j < N - 1; j++) {
				for(int k = j + 1; k < N; k++) {
					int temp = arr[i] + arr[j] + arr[k];
					if(M == temp) {
						return temp;
					}
					if(result<temp && temp<M) {
						result = temp;
					}
				}
			}
		}
		return result;
	}
}
