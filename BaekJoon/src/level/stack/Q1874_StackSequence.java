package level.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Q1874_StackSequence {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		// 스택에 오름차순으로 넣고, peek이 sequence의 i와 같다면 pop
		// 오름차순으로 넣기
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int[] sequence = arr.clone(); // 정렬한 배열
		Arrays.sort(sequence);
		Stack<Integer> stack = new Stack<Integer>();
		int j = 0;
		for(int i = 0; i < sequence.length; i++) {
			stack.push(sequence[i]);
			sb.append("+\n");
			while(j < arr.length) {
				if(!stack.isEmpty() && stack.peek() == arr[j]) {
					stack.pop();
					sb.append("-\n");
					j++;
				} else {
					break;
				}
			}
		}
		if (stack.isEmpty()) {
			System.out.println(sb.toString());
		} else {
			System.out.println("NO");
		}
	}
}
