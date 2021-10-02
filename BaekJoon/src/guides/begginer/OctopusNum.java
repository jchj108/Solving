package guides.begginer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OctopusNum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = "";
		while (!(s = br.readLine()).equals("#")) {
			bw.write(getDecimal(s)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static int getDecimal(String s) {
		int sum = 0;
//		s.length() -1을 지수로
		int j = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			int temp = 0;
			switch (s.charAt(i)) {
			case '-':
				temp = 0;
				break;
			case '\\':
				temp = 1;
				break;
			case '(':
				temp = 2;
				break;
			case '@':
				temp = 3;
				break;
			case '?':
				temp = 4;
				break;
			case '>':
				temp = 5;
				break;
			case '&':
				temp = 6;
				break;
			case '%':
				temp = 7;
				break;
			case '/':
				temp = -1;
			}
			sum += temp * (int)Math.pow(8, j--);
		}
		return sum;
	}
}
