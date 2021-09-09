package level.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622_Dial {

	public static void main(String[] args) throws IOException {
		//PQRS
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int num = 0;
		for(int i = 0; i < s.length(); i++) {
			
			
			System.out.println(s.charAt(i)-'A');
			
//			if(s.charAt(i)-'A' == )
			
			int calc = (s.charAt(i)-'A')/3+3;
			
//			System.out.println(calc);
			
			num += calc;
		}
//		System.out.println(num);
		
		
	}

}
