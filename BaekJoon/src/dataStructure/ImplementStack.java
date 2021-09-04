package dataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class ImplementStack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			if(s.contains("push")) {
				String spt[] = s.split(" ");
				stack.push(Integer.parseInt(spt[1]));
		
		
		
		
	}

}
