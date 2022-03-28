package level2.test;

import java.util.Stack;

public class Bracket {

	public static void main(String[] args) {
		Bracket b = new Bracket();

		System.out.println(b.solution("()"));

	}

	boolean solution(String s) {
		boolean answer = true;
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(stack.isEmpty())
			
		}
		return stack.isEmpty();
	}

}
