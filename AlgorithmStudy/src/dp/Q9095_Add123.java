package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9095_Add123 {

	static int[] d = new int[11];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write(dp(n)+"\n");
		}
		bw.flush();
		bw.close();
	}
	private static int dp(int n) {
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 2;
		}
		if(n == 3) {
			return 4;
		}
		if(d[n] != 0) {
			return d[n];
		}
		return d[n] = dp(n-1) + dp(n-2) + dp(n-3);
	}
}
