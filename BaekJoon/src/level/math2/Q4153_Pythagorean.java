package level.math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q4153_Pythagorean {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line = "";

		while (!(line = br.readLine()).equals("0 0 0")) {

			StringTokenizer st = new StringTokenizer(line);

			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int num3 = Integer.parseInt(st.nextToken());

			int max = num1;
			int min1 = num2;
			int min2 = num3;

			if (num2 > max) {
				max = num2;
				min1 = num1;
			} 
			if (num3 > max) {
				max = num3;
				min2 = num2;
			}

			if (max * max == min1 * min1 + min2 * min2) {
				bw.write("right\n");
			} else {
				bw.write("wrong\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
