package level.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978_FindPrimeNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 0;

		for (int i = 0; i < T; i++) {
			int num = Integer.parseInt(st.nextToken());
			boolean flag = true;
			if (num != 1) {
				for (int j = 2; j < num; j++) {
					flag = true;
					if (num % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
