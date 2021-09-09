package level.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11720_addStringInteger {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int N = Integer.parseInt(br.readLine());
		String line = br.readLine();
		for (int j = 0; j < line.length(); j++) {
			sum += line.charAt(j) - '0';
		}
		System.out.println(sum);
	}

}
