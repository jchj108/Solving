package level.function;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1065_Hansoo {

	static int N;
	static int count;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		if(N == 1000) { // 예외처리
			N = 999;
		}
		
		for(int i = 1; i <= N; i++) {
			if(hansoo(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean hansoo(int num) {
		
		if(num < 100) {
			return true;
		}

		int n1 = num / 100; // 100의 자리
		int n2 = (num / 10) % 10; // 10의 자리
		int n3 = num % 10; // 1의 자리
		
		if((n1 - n2) == (n2 - n3)) {
			return true;
		}

		return false;
	}

}
