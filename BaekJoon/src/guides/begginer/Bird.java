package guides.begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bird {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong((br.readLine()));

		int i = 1;
		int count = 0;
		while (N > 0) {
			N -= i;
			i++;
			count++;
			if(N - i < 0) {
				i = 1;
			}
		}
		System.out.println(count);
	}
}
