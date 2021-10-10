package dp;

public class Fibonacci {

	static int[] d; // 메모리제이션

	static int dp(int x) {
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
	}

	public static void main(String[] args) {
		
		d = new int[11];
		
		System.out.println(dp(10));
	}
}
