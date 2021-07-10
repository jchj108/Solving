package level1.test;

import java.util.Scanner;

public class StringDesc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringDesc sd = new StringDesc();
		String answer = sd.solution(sc.nextLine());
		System.out.println(answer);
	}
	
	public String solution(String s) {
		String answer = "";
		char cArr[] = s.toCharArray();
		
		for(int i = 0; i < cArr.length; i++) {
			for(int j = 0; j < cArr.length; j++) {
				int temp = (int)cArr[i];           
				if(cArr[i] > cArr[j]) {
					cArr[i] = cArr[j];
					cArr[j] = (char)temp;
				}
			}
		}
		for(int i = 0; i < cArr.length; i++) {
			answer += cArr[i];
		}
		return answer;
	}
}
