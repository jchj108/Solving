package level1.test;

import java.util.ArrayList;

public class CrainGame {

	public int solution(int[][] board, int[] moves) {
		// �ٱ��ϴ� ������ ũ��
		// board�� ���簢��
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int i = 0; i < moves.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					System.out.print(board[j][moves[i]-1]); // ���� ����
					list.add(board[j][moves[i]-1]);
					board[j][moves[i]-1] = 0;
					break;
				} // ��� ������ �ƹ� �ϵ� �Ͼ�� ����
			}
			System.out.println();
		}

		// ����Ʈ���� �������� �� ���� �ߺ��ȴٸ� ����
		for(int i = list.size()-1; i > 0; i--) {
			if(list.get(i) ==list.get(i-1)) {
				list.remove(i);
				list.remove(i-1);
				answer += 2;
			}
		}
		
		System.out.println("list size : " + list.size());
		
		return answer;

	}

	public static void main(String[] args) {
		int result = new CrainGame().solution(new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 },
				{ 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } }, new int[] { 1, 5, 3, 5, 1, 2, 1, 4 });
		System.out.println(result);
	}
}
