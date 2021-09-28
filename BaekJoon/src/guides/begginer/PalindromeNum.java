package guides.begginer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PalindromeNum {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = "";

		while (!(s = br.readLine()).equals("0")) {
			int j = s.length() - 1;
			boolean flag = true;
			for (int i = 0; i < s.length() / 2 + 1; i++) {
				if(s.charAt(j) != s.charAt(i)) {
					flag = false;
				}
				j--;
			}
			if(flag) {
				bw.write("yes\n");
			} else {
				bw.write("no\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
