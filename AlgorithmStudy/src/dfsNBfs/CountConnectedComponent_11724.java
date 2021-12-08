package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountConnectedComponent_11724 {
	// ������ �׷���

	static int[][] matrix;
	static boolean[] visited;
	static int count;
	static int N, M;
	
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // ������ ����
		M = Integer.parseInt(st.nextToken()); // ������ ����

		matrix = new int[N + 1][N + 1];
		visited = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());
			matrix[row][col] = 1;
			matrix[col][row] = 1;
		}
		
		for(int i = 1; i <= N; i++) { // visited �迭 Ž���ϸ鼭 dfs
			if(!visited[i]) {
				dfs(i);
				count++;
			}
		}
	}

	private static void dfs(int start) {
		visited[start] = true;
		
		for(int i = 1; i <= N; i++) {
			if(matrix[start][i] == 1 && visited[i]) {
				dfs(i);
			}
		}
	}
}
