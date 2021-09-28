package guides.begginer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AlwaysDefeat {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] our = new int[9];
		for (int i = 0; i < our.length; i++) {
			our[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int[] they = new int[9];
		for (int i = 0; i < they.length; i++) {
			they[i] = Integer.parseInt(st.nextToken());
		}
		boolean flag = false;
		int ourSum = 0;
		int theySum = 0;
		for (int i = 0; i < our.length; i++) {
			ourSum += our[i];
			if(ourSum > theySum) {
				flag = true;
			}
			theySum += they[i];
		}
		
		if(flag && ourSum < theySum) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}
		bw.flush();
		bw.close();
	}
}
