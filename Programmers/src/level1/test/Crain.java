package level1.test;

import java.util.Stack;

public class Crain {

	public static void main(String[] args) {
		
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4}; // 해당 column 에서 인형 뽑기
		
		int result = solution(board, moves);
		System.out.println(result);
		
	}
	public static int solution(int[][] board, int[] moves) {
		
		int cnt = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i : moves) {
			for(int j = 0; j < board.length; j++) { // column의 깊이만큼
				if(board[j][i-1] != 0) { // 인형을 만났을 때
					if(!stack.isEmpty() && stack.peek() == board[j][i-1]) {
						stack.pop();
						cnt+=2;
					} else {
						stack.push(board[j][i-1]);
					}
					board[j][i-1] = 0; // map에서 꺼낸 인형 삭제
					break;
				}
			}
		}
		
		return cnt;
	}
}
