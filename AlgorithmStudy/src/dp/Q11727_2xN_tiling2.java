package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11727_2xN_tiling2 {
	private static int[] d;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		d = new int[n+1];
		System.out.println(dp(n));
	}
	
	private static int dp(int n) {
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 3;
		}
		if(d[n] != 0) {
			return d[n];
		}
		return d[n] = (dp(n-1) + 2 * dp(n-2)) % 10007;
	}
}
