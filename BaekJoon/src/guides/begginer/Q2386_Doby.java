package guides.begginer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2386_Doby {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char alp;
		while(true) {
			String st = br.readLine().toLowerCase();
			int count = 0;
			if(st.equals("#")) {
				break;
			}
			alp = st.charAt(0);
			for(int i = 2; i < st.length(); i++) {
				if(st.charAt(i) == alp) {
					count++;
				}
			}
			bw.write(alp + " " + count+"\n");
		}
		bw.flush();
		bw.close();
	}
}
