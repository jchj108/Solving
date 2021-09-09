package level.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10870_Fivonacci {

	private static int fivonacci(int recur) {
		
		if(recur <= 1) {
			return recur;
		} else {
			return fivonacci(recur - 1) + fivonacci(recur-2);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = fivonacci(Integer.parseInt(br.readLine())); 
		
		System.out.println(result);
		br.close();
	}
}
