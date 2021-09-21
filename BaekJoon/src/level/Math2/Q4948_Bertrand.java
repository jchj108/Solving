package level.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4948_Bertrand {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 0;
		while ((n = Integer.parseInt(br.readLine())) != 0) {

			int min = n; // n
			int max = 2 * n; // 2n
			int count = 0; // 소수 개수
			boolean[] arr = new boolean[max - min];

			for (int i = 2; i * i <= max; i++) {
				for (int j = i * i; j <= max; j += i) {
					if (j - min <= 0) {
						continue;
					}
					arr[j - min - 1] = true;
				}
			}

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == false) {
					count++;
				}
			}

			if(n == 1) {
				sb.append(1 + "\n");
			} else {
				sb.append(count + "\n");
			}
		}
		System.out.println(sb.toString());
	}
}
