package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tomato_7576 {

	static int M, N;
	static int[][] matrix;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		// bfs�� �丶�䰡 ����ִ� ĭ ���ÿ� Ž���ؾ� ��
		// 1�� �丶�並 ���� ť�� �ְ� BFS 1ȸ��
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken()); // ���� ĭ ��
		N = Integer.parseInt(st.nextToken()); // ���� ĭ ��
		
		matrix = new int[M][N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
	}
}
