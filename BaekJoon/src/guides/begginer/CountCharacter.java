package guides.begginer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CountCharacter {

	public static void main(String[] args) throws IOException {
		
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = "";
		while(!(s = br.readLine()).equals("#")) {
			s = s.replace(" ", ""); // ���� ����
			s = s.toLowerCase(); // �ҹ��ڷ� ��ȯ
			int count = 0;
			for(int i = 0; i < s.length(); i++) {
				for(int j = 0; j < vowel.length; j++) {
					if(s.charAt(i) == vowel[j]) {
						count++;
						break;
					}
				}
			}
			bw.write(count+"\n");
		}
		bw.flush();
		bw.close();
	}
}
