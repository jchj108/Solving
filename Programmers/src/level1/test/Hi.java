package level1.test;

import java.util.ArrayList;

public class Hi {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4}; // 해당 column 에서 인형 뽑기
		
		int result = solution(board, moves);
	}

	public static int solution(int[][] board, int[] moves) {

		
		for(int i : moves) {
			System.out.println(moves[i]);
		}
		return 0;
//        int cnt = 0;
//	        for (int i : moves){
//	            for (int k = 0 ; k <board.length; k++){
//	                if(board[i][k-1] != 0){
//	                    box.add(board[i][k-1]);
//	                    board[i].set(k-1,0);
//	                    break;
//	                }
//	                try{
//	                    if (box.get(box.size() - 1)) == (box.get(box.size() - 2)){
//	                        cnt += 2;
//	                        box.remove(box.size()-1);
//	                        box.remove(box.size()-2);
//	                        }
//	                    }
//	                catch(){
//
//	                    }
//	                }
//
//
//	        }
//	}
	}
}
