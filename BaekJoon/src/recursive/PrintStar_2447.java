package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar_2447 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		print(N);
		

	}

	private static void print(int n) {
		
		if(n <= 3) {
			
		} else {
			
			
			
			
			print(n/3);
		}
	}

}
