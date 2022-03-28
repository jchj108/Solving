package level2.test;

import java.util.Stack;

public class CorrectBracket {
	
    boolean solution(String s) {
        boolean answer = false;
        // pop ���� �����
        Stack<Character> stack = new Stack<Character>();
        
        
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	
        	if(c == '(') {
        		stack.push(c);
        	} else {
        		if(stack.isEmpty()) {
        			return answer;
        		} else if(stack.pop()!='(') {
        			return answer;
        		}
        		
        	}
        }
        
        return stack.isEmpty();
        
    }

	public static void main(String[] args) {
		CorrectBracket cb = new CorrectBracket();
		cb.solution(")()(");
	}
}
