package guides.begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2475_VerificationNum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		
		while(st.hasMoreTokens()) {
			int tmp = Integer.parseInt(st.nextToken());
			sum += tmp * tmp;
		}
		System.out.println(sum % 10);
	}

}
