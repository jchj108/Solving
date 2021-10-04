package level2.test;

import java.util.Stack;

public class CorrectBracket {
	
    boolean solution(String s) {
        boolean answer = true;
        // pop 으로 지우기
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
        	if(!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')') {
        		stack.pop();
        	} else {
        		stack.push(s.charAt(i));
        	}
        }
        
        return stack.size() == 0 ? true : false;
    }

	public static void main(String[] args) {
		CorrectBracket cb = new CorrectBracket();
		cb.solution(")()(");
	}
}
