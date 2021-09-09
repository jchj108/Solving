package level.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2941_CroatiaAlphabet {
	
	
	public static void main(String[] args) throws IOException {
		String arr = "c= c- dz= d- lj nj s= z=";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s, arr);
		System.out.println(st.countTokens());
		
	}

}
