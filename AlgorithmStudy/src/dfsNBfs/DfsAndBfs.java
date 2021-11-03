package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DfsAndBfs {
	
	static int[][] matrix; // 인접행렬로 그래프 구현
	static int N;
	static int M;
	static int V;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 방문할 수 있는 정점이 여러개인 경우는 정점 번호가 작은 것을 먼저 방문해야 한다.
		
		
		// 정점 : 각각의 지점
		// 간선 : 정점과 정점의 연결
		/* DFS (깊이 우선 탐색) : 현재 정점과 연결된 정점들을 하나씩 갈 수 있는지 검사하고,
		         특정 정점으로 갈 수 있다면 그 정점에 가서 같은 행위를 반복 (재귀를 통해 구현) */
		
		N = Integer.parseInt(st.nextToken()); // 정점의 개수
		M = Integer.parseInt(st.nextToken()); // 간선의 개수
		V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호

		matrix = new int[N+1][N+1]; // 인덱스와 값을 맞추기 위해 행렬 크기 +1
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			matrix[x][y] = 1;
			matrix[y][x] = 1;
		}
		
		dfs(V);
		
	}

	private static void dfs(int v) {
		
		
		
		
	}
}
