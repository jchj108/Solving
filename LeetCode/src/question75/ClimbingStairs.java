package question75;

import java.util.Arrays;

public class ClimbingStairs {

	static int[] d;
	static int count;

	public static void main(String[] args) {
		
		int result = climbStairs(5);
		
		System.out.println(result);
	}

	public static int climbStairs(int n) {
		 
		d = new int[n+1];
		Arrays.fill(d, -1);
		return dp(n);
	}

	private static int dp(int n) {
		
		if(d[n] == -1) {
			int r;
			if(n == 0 || n == 1 || n == 2) {
				r = n;
			} else {
				r = dp(n-1) + dp(n-2);
			}
			d[n] = r;
		}
		
		return d[n];
	}
}
