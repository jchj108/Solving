package test;

import java.util.Stack;

public class A {

	public static void main(String[] args) {

		String s = "AAWSWS";
		String result = getFinalString(s);
		System.out.println(result);

	}

	private static String getFinalString(String s) {
		String answer = s;
		
		if(s.indexOf("AWS") == -1) {
			return s;
		}
		
		Stack<String> stack = new Stack<String>();
		
		stack.push(s);
		
		while(!stack.isEmpty()) {
			String last = stack.pop();
			int startIndex = last.indexOf("AWS");
			if(startIndex == -1) { // 포함하지 않는다면
				if(last.length() == 0) {
					return "-1";
				} else {
					return last;
				}
			} else {
				String temp = "";
				for(int i = 0; i < last.length(); i++) {
					if(i >= startIndex && i <= startIndex + 2) {
						continue;
					}
					temp += last.charAt(i);
				}
				stack.push(temp);
			}
		}
		return answer;
	}
}
