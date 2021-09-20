package level.Math1;

import java.io.*;
import java.util.*;

public class Q10250_ACMHotel {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			if(N%H == 0) {
				sb.append(H*100 + (N/H));
			} else {
				sb.append(((N%H) * 100) + ((N / H) + 1));
			}

			
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
