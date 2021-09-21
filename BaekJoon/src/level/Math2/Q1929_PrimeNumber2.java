package level.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929_PrimeNumber2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int min = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());

		boolean[] arr = new boolean[max - min + 1];
		
		if (min == 1) {
			arr[0] = true;
		}
		// i + min으로 boolean에서 꺼내와 소수로 출력하기
		// 소수가 아닌 수를 먼저 찾기
		for (int i = 2; i * i <= max; i++) {
			for (int j = i * i; j <= max; j+= i) {
				if(j - min >= 0) {
					arr[j - min] = true;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == false) {
				System.out.println(i+min);
			}
		}
	}
}
