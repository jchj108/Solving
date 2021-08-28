package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ImplementStack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			
			int X = 0;
			
			if(s.lastIndexOf(' ') != -1) {
				String[] sArr = s.split(" ");
				s = sArr[0];
				X = Integer.parseInt(sArr[1]);
			}
			
			switch (s) {
			case "push" : push(X); break;
			case "pop" : pop(); break;
			case "top" : top(); break;
			case "size" : size(); break;
			case "empty" : empty(); break;
			}
		}
	}

	private static void push(int x) {
		
	}
	private static void top() {
		
	}

	private static void empty() {
		
	}

	private static void size() {
	}

	private static void pop() {
		
	}

}
