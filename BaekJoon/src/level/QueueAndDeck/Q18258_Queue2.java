package level.QueueAndDeck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18258_Queue2 {

	private static int size;
	private static int num;
	private static int[] que;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push" : push(Integer.parseInt(st.nextToken())); break;
			case "pop" : pop(); break;
			case "size" : size(); break;
			case "empty" : empty(); break;
			case "front" : front(); break;
			case "back" : back(); break;
			
			}
			
		}
		
	}

	private static void push(int n) {
		que[back] = n;
	}
	private static void back() {
		// TODO Auto-generated method stub
		
	}

	private static void empty() {
		// TODO Auto-generated method stub
		
	}

	private static void size() {
		// TODO Auto-generated method stub
		
	}

	private static void front() {
		// TODO Auto-generated method stub
		
	}

	private static void pop() {
		// TODO Auto-generated method stub
		
	}


}
