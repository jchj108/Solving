package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1463_MakeItOne {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int count = dp(N);
		
		
	}

	private static int dp(int n) {
		int count = 0;
		if(n == 1) {
			return count;
		}
		if(n % 3 == 0) {
			return dp(n/3);
		}
	}
}
