package level1.test;

import java.util.ArrayList;

public class DartGame {

	public int solution(String dartResult) {
		int answer = 0;
		int[] num = new int[3];
		ArrayList<Integer> check = new ArrayList<Integer>();
		
		int j = 0;
		int count = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			char cIndex = dartResult.charAt(i);
			
			if (Character.isDigit(cIndex)) {
				if(Character.isDigit(dartResult.charAt(i+1))) {
					i++;
					num[count++] = 10;
				} else {
					num[count++] = cIndex - '0';
				}
			} else {
				switch(cIndex) {
				
				case 'S' :
					j++;
					check.add(num[count - 1]); break;
				case 'D' : 
					j++;
					check.add((int)Math.pow(num[count - 1], 2)); 
					break;
				case 'T' : 
					j++;
					check.add((int)Math.pow(num[count - 1], 3)); break;
				case '#' :
					check.set(j-1, check.get(j-1) * -1);
					break;
				}
				if(cIndex == '*') {
					if(j==1) {
						check.set(j-1, check.get(j-1) * 2);
					} else {
						check.set(j-1, check.get(j-1) * 2);
						check.set(j-2, check.get(j-2) * 2);
					}
				}
			}
		}
		
		for(int q : num) {
			System.out.println("옵션 계산 전 점수 : " + q);
		}
		for(int w : check) {
			System.out.println("옵션 계산 후 점수 : " + w);
		}
		

		for(int m = 0; m < check.size(); m++) {
			answer += check.get(m);
		}

		return answer;
	}

	public static void main(String[] args) {

		int result = new DartGame().solution("1T2D3D#");
		
		System.out.println("result : " + result);
	}

}

