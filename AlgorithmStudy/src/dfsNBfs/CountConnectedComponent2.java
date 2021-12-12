package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class CountConnectedComponent2 { // 연결요소의 개수 찾기
	// BFS 버전
	static int N, M, count;
	static int[][] matrix;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); // 정점의 개수 
		M = Integer.parseInt(st.nextToken()); // 간선의 개수
		
		matrix = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for (int i = 0; i < M; i++) { // 간선의 개수만큼 반복
			st = new StringTokenizer(br.readLine());
			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());
			matrix[row][col] = 1;
			matrix[col][row] = 1;
		}
		for(int i = 1; i <= N; i++) {
			if(!visited[i]) {
				bfs(i);
				count++;
			}
		}
		System.out.println(count);
	}
	private static void bfs(int x) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);
		visited[x] = true;
		while(!q.isEmpty()) {
			int cur = q.poll();
			for(int i = 1; i <= N; i++) { 
				if(!visited[i] && matrix[cur][i] == 1) {
					visited[i] = true;
					q.offer(i);
				}
			}
		}
	}
}
