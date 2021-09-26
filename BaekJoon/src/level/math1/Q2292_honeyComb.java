package level.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292_honeyComb {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int endPoint = 1;
		for (int i = 1; i < Math.sqrt(1000000000); i++) {
			endPoint += 6 * i;
			if (N <= endPoint) {
				if (N == 1) {
					System.out.println(i);
				} else {
					System.out.println(i + 1);

				}
				break;
			}
		}
	}
}
