package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Virus {
	
	static int count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 정점(컴퓨터)의 개수
		int m = Integer.parseInt(br.readLine()); // 간선의 개수
		int v = 1; // 탐색을 시작할 컴퓨터 번호
		
		int[][] matrix = new int[n+1][n+1];
		boolean[] visited = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			matrix[x][y] = 1;
			matrix[y][x] = 1;
		}
		bfs(v, matrix, visited);
		System.out.println(count);
	}

	private static void bfs(int v, int[][] matrix, boolean[] visited) {
		visited[v] = true;
		
		for(int i = 1; i < matrix.length; i++) {
			if(matrix[v][i] == 1 && !visited[i]) { // 인접행렬 가로로 탐색, v는 재귀를 돌면서 바뀜
				bfs(i, matrix, visited);
				count++;
			}
		}
		
	}
}
