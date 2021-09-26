package level.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231_decomposition {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(getDecomposition(N));
		
	}

	private static int getDecomposition(int N) {
		
		for(int i = 0; i < N; i++) {
			int number = i;
			int sum = 0; // 각 자리수 합 변수
			
			while(number != 0) {
				sum+=number%10;
				number /= 10;
			}
			// i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우
			if(sum + i == N) {
				return i;
			} 
		}
		return 0;
	}
}
