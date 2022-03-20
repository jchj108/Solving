package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LostBracket {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		Stack<Integer> stack = new Stack<Integer>();
		String temp = "";
		
		/* - 뒤에 +가 오면 괄호로 묶어서 더하기
		 * 
		 * 
		 */
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			//			if(!(c == '+' || c == '-')) {
//				temp += c;
//			} else {
//				stack.push(Integer.parseInt(temp));
//				temp = "";
//			} 
//			if(i == s.length()-1) {
//				stack.push(Integer.parseInt(temp));
//			}
			if(c == '-') {
				
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}

}
