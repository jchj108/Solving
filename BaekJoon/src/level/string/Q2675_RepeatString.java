package level.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2675_RepeatString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine()); 
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int repeat = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				
				for(int k = 0; k < repeat; k++) {
					sb.append(c);
				}
			}
			sb.append("\n");
			
		}
		
		System.out.print(sb.toString());
		
	}
	
}
