package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SafetyArea_2468 {

	static int matrix[][];
	static boolean visited[][];
	static int dx[] = { 0, -1, 0, 1 };
	static int dy[] = { -1, 0, 1, 0 };
	static int N;

	static class Area {
		int x, y, height;

		public Area(int x, int y, int height) {
			this.x = x;
			this.y = y;
			this.height = height;
		}
	}
	// 안전한 영역의 최대개수를 구해야함
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		matrix = new int[N][N];

		int height = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
				if(matrix[i][j] > height) {
					height = matrix[i][j];
				}
			}
		}
		
		int max = 0;
		for(int rain = 0; rain < height; rain++) {
			visited = new boolean[N][N];
			int cnt = 0; // 회차별(비의 높이별) 최대 (후보)
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j] && matrix[i][j] > rain) {
						cnt++;
						bfs(i, j, rain);
					}
				}
			}
			max = Math.max(max, cnt);
		}
		
		System.out.println(max);
		
		
	}

	private static void bfs(int x, int y, int rain) {
		Queue<Area> q = new LinkedList<Area>();
		q.add(new Area(x, y, matrix[x][y]));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			Area cur = q.remove();
			
			for(int i = 0; i < 4; i++) {
				int nextX = cur.x + dx[i];
				int nextY = cur.y + dy[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) {
					continue;
				}
				if(matrix[nextX][nextY] > rain && !visited[nextX][nextY]) {
					q.add(new Area(nextX, nextY, matrix[nextX][nextY]));
					visited[nextX][nextY] = true;
				}
				
			}
		}
		
	}
}
