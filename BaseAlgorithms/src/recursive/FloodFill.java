package recursive;

import java.io.IOException;
import java.util.Scanner;

public class FloodFill {
	
	static int N;
	static int[][] Board = new int[100][100];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				Board[i][j] = sc.nextInt();
			}
		}
		int sRow, sCol;
		sRow = sc.nextInt(); sCol = sc.nextInt();
		fill(sRow, sCol);
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(Board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void fill(int r, int c) {
		if(r < 0 || r > N - 1 || c < 0 || c > N - 1) { // base case (가장자리)
			return;
		}
		if(Board[r][c] != 0) { // 0이 아닌 것을 만난다면
			return;
		}
		Board[r][c] = 1;
		
		fill(r - 1, c);
		fill(r + 1, c);
		fill(r, c - 1);
		fill(r, c + 1);
	}
}
