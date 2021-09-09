package level.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809_FindAlphabet {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alphabet = new int[26];
		
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		String S = br.readLine();
		
		for(int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			
			if(alphabet[c - 'a'] == -1) {
				alphabet[c -'a'] = i;
			}
		}
		
		for(int i : alphabet) {
			System.out.print(i + " ");
		}
	}
}
