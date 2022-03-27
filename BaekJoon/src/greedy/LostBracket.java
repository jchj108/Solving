package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class LostBracket {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		ArrayList<String> list = new ArrayList<String>();
		
		String temp = "";
		
		/* - 뒤에 +가 오면 괄호로 묶어서 더하기
		 * 
		 * 
		 */
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			stack.push(c);
			temp += c; 
			
			if(!stack.isEmpty()) {
				char last = stack.peek();
				if(last == '+' || last == '-') {
					list.add(temp);
					temp = "";
				}
			}
			
			
		}
		
		for(String sc : list) {
			System.out.println(sc);
		}
		
	}

}
