package jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HamiltonCircuit {
	
	static int[][] map;
	static boolean[] visited;
	static int N;
	static int result = Integer.MAX_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine().trim());
		map = new int[N][N];
		visited = new boolean[N];
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j ++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0, 0);
		
	}


	private static void dfs(int cur, int cnt, int cost) {
		if(cost > result) {
			return;
		}
		
		if(cnt==N-1) {
			
		}
		
	}
}
