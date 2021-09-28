package guides.begginer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MostCharacter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int alphabet[] = new int[26];
		String s = "";
		while((s = br.readLine()) != null) {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					alphabet[s.charAt(i) - 'a']++;
				}
			}
		}
		int max = 0;
		for(int i = 0; i < alphabet.length; i++) {
			if(max < alphabet[i] ) {
				max = alphabet[i];
			}
		}
		for(int i= 0; i < alphabet.length; i++) {
			if(max == alphabet[i]) {
				System.out.print((char)(i + 'a'));
			}
		}
	}
}
