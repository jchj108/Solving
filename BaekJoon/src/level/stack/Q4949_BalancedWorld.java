package level.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949_BalancedWorld {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s = "";
		while (!(s = br.readLine()).equals(".")) {
			Stack<Character> stack = new Stack<Character>();
			String tmp = "";
			for (int i = 0; i < s.length(); i++) {
				if (!stack.isEmpty() && (stack.peek() == '[' && s.charAt(i) == ']' || stack.peek() == '(' && s.charAt(i) == ')')) {
					stack.pop();
				} else if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '[' || s.charAt(i) == ']') {
					stack.push(s.charAt(i));
				}
			}

			if (stack.isEmpty()) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
		}
		System.out.println(sb.toString());
	}
}
