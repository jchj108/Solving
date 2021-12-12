package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class FindParentNode_11725 {

	static int matrix[][];
	static boolean visited[];
	static int[] parent;
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine()); // 노드의 개수
		matrix = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i = 1; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			matrix[x][y] = 1;
			matrix[y][x] = 1;
		}
		show();
		for(int i = 1; i < visited.length; i++) {
			if(!visited[i]) {
				dfs(1);
			}
		}
	}
	private static void dfs(int start) {
		visited[start] = true;
		System.out.println(start);
		for(int i = 1; i <= N; i++ ) {
			if(!visited[i] && matrix[start][i]==1) {
				dfs(i);
			}
		}
	}

	private static void show() {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(i == 0 || j == 0){
					continue;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
