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
		// bfs로 토마토가 들어있는 칸 동시에 탐색해야 함
		// 1인 토마토를 전부 큐에 넣고 BFS 1회전
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken()); // 가로 칸 수
		N = Integer.parseInt(st.nextToken()); // 세로 칸 수
		
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
