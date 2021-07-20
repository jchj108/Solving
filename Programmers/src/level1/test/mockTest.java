package level1.test;

import java.util.ArrayList;

public class mockTest {
    public int[] solution(int[] answers) {
        
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        
        for(int i = 0; i < answers.length; i++) {
        	// 나누는 수가 더 클 경우 나눠지는 수가 그대로 반환
        	if(num1[i%num1.length] == answers[i]) {
        		answer1++;
        	}
        	if(num2[i%num2.length] == answers[i]) {
        		answer2++;
        	}
        	if(num3[i%num3.length] == answers[i]) {
        		answer3++;
        	}
        }
        
        int max = 0;
        max = answer1;
        if(answer2 > max) {
        	max = answer2;
        }
        if(answer3 > max) {
        	max = answer3;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(max==answer1) list.add(1);
        if(max==answer2) list.add(2);
        if(max==answer3) list.add(3);
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		
		int[] answer;
		
		answer = new mockTest().solution( new int [] {1,3,2,4,2} );
		
	}
}
