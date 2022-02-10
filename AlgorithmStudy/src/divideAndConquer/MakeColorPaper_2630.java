package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeColorPaper_2630 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		if(s.length() > 10) {
			System.out.println(s.substring(0, 10));
		} else {
			System.out.println(s);
		}
	}
}
