package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1476_CalcDate {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int result = calc(e, s, m);
		System.out.println(result);
	}

	private static int calc(int E, int S, int M) {
		int year = 0; // 누적 연도
		
		while(true) {
			int e = year % 15;
			int s = year % 28;
			int m = year % 19;
			
			if(e == E-1 && s == S-1 && m == M-1) {
				return year+1;
			} else {
				year++;
			}
		}
	}
}
