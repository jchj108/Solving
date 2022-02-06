package level1.test;

import java.util.Stack;

public class Crain {

	public static void main(String[] args) {
		
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4}; 
		
		int result = solution(board, moves);
		System.out.println(result);
		
	}
	public static int solution(int[][] board, int[] moves) {
		
		int cnt = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i : moves) {
			for(int j = 0; j < board.length; j++) {
				if(board[j][i-1] != 0) { 
					if(!stack.isEmpty() && stack.peek() == board[j][i-1]) {
						stack.pop();
						cnt+=2;
					} else {
						stack.push(board[j][i-1]);
					}
					board[j][i-1] = 0;
					break;
				}
			}
		}
		
		return cnt;
	}
}
