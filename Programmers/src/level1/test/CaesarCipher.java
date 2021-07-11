package level1.test;

import java.util.Scanner;

public class CaesarCipher {

	public String solution(String s, int n) {
		String answer = "";
		
		char cArr[] = s.toCharArray();
		
		for(int i = 0; i < cArr.length; i++) {

			if(cArr[i] != ' ') {
				if(Character.isLowerCase(cArr[i])) {
					cArr[i] = (char)(cArr[i] + n);
					if(cArr[i] > 'z') {
						cArr[i] = (char)(cArr[i] - 26);
					}
				}
				else if(Character.isUpperCase(cArr[i])) {
					cArr[i] = (char)(cArr[i] + n);
					if(cArr[i] > 'Z') {
						cArr[i] = (char)(cArr[i] - 26);
					}
				}
			} else {
				cArr[i] = ' ';
			}
		}
		
		for(int i = 0; i < cArr.length; i++) {
			answer += cArr[i];
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CaesarCipher cc = new CaesarCipher();
		cc.solution(sc.nextLine(), sc.nextInt());
	}
}
