package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ColorWeakness_10026 {

	static char[][] matrix;
	static boolean[][] visited;
	static int N;
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { -1, 0, 1, 0 };
	
	static class Color {
		int x, y;
		char color;

		Color(int x, int y, char color) {
			this.x = x;
			this.y = y;
			this.color = color;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		matrix = new char[N][N];
		visited = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				matrix[i][j] = s.charAt(j);
			}
		}
		
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					bfs(i, j);
					cnt++;
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append(cnt).append(" ");
		
		cnt = 0;
		
		for (int i = 0; i < N; i++) { // 색 바꾸기
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 'R') {
					matrix[i][j] = 'G';
				}
			}
		}
		
		visited = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					bfs(i, j);
					cnt++;
				}
			}
		}
		sb.append(cnt);
		System.out.println(sb.toString());
		
	}

	private static void bfs(int x, int y) {
		Queue<Color> q = new LinkedList<Color>();
		visited[x][y] = true;
		q.add(new Color(x, y, matrix[x][y]));
		
		while(!q.isEmpty()) {
			Color cur = q.remove();
			
			for(int i = 0; i < 4; i++) {
				int nextX = cur.x + dx[i];
				int nextY = cur.y + dy[i];
				
				if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < N && !visited[nextX][nextY] && cur.color == matrix[nextX][nextY]) {
					q.add(new Color(nextX, nextY, matrix[nextX][nextY]));
					visited[nextX][nextY] = true;
				}
			}
		}
	}
}
