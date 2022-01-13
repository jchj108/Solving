package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Alphabet_1987 {
	
	static int R, C, result;
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {-1, 0, 1, 0}; 
	static boolean[] visited;
	static char[][] map;
	static class Horse {
		int x, y, dist;
		ArrayList<Character> list = new ArrayList<Character>();
		
		public Horse(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		visited = new boolean[26];
		map = new char[R][C];
		
		for(int i = 0; i < R; i++) {
			String s = br.readLine();
			for(int j = 0; j < C; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		dfs(0, 0, 1);
		System.out.println(result);
		
	}

	private static void dfs(int x, int y, int dist) {
		visited[map[x][y] - 'A'] = true;
		for(int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(0 <= nextX && nextX < R && 0 <= nextY && nextY < C) {
				if(!visited[map[nextX][nextY] - 'A']) {
					dfs(nextX, nextY, dist + 1);
				}
			}
		}
		
		visited[map[x][y] - 'A'] = false;
		result = Math.max(result, dist);
	}
}
