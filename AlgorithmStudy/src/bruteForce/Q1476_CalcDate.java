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

	private static int calc(int e, int s, int m) {
	
		int year = 0; // 누적 연도
		
		while(true) {
			if(year % 15 == e && year % 28 == s && year % 19 == m) {
				return year;
			} else {
				year++;
			}
		}
	}
}
