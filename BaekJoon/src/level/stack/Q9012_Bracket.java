package level.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012_Bracket {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String sc = "";
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			Stack<Character> stack = new Stack<Character>();
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				if (!stack.isEmpty() && stack.peek() == '(' && s.charAt(j) == ')') {
						stack.pop();
				} else {
					stack.push(s.charAt(j));
				}
			}
			if (stack.isEmpty()) {
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb.toString());
	}
}
