package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci2 {
	static long[] d;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		d = new long[n+1];
		System.out.println(dp(n));

	}

	private static long dp(int x) {
		if (x == 1) {
			return 1;
		}
		if (x == 2) {
			return 1;
		}
		if (d[x] != 0) { 
			return d[x];
		}
		return d[x] = dp(x - 1) + dp(x - 2); 
//		return dp(x-1) + dp(x-2);
	}
}
