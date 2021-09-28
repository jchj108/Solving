package guides.begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int start = 64;
		int count = 0;
		int sum = 0;
		
		while(X > 0) {
			if(start > X) {
				start /= 2;
			} else {
				count++;
				X -= start;
			}
		}
		System.out.println(count);
	}
}
