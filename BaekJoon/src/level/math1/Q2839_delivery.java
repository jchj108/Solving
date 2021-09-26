package level.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839_delivery {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		int count = -1;
		int remainder = 0;

		for (int i = 1; i < N / 3; i++) {
			if ((N - (5 * i)) % 3 == 0 && (N - (5 * i) > 0)) {
				remainder = N - (5 * i);
				count = remainder / 3 + i;
			}
		}

		if (count == -1 && N % 3 == 0) {
			count = N / 3;
		}

		if (N % 5 == 0) {
			count = N / 5;
		}

		System.out.println(count);
	}
}
