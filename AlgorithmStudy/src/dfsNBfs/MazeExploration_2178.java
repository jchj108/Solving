package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MazeExploration_2178 {
	static int N, M; // row, col
	
	static int[] dx = { -1, 0, 1, 0 }; // col
	static int[] dy = { 0, -1, 0, 1 }; // row
	static int[][] matrix;
	static boolean[][] visited;
	static class Point {
		int row, col, dist;
		Point(int r, int c, int d) {
			row = r; col = c; dist = d;
		}
	}
	public static void main(String[] args) throws IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		matrix = new int[N+1][M+1];
		for (int i = 1; i <= N; i++) {
			String s = br.readLine();
			for (int j = 1; j <= M; j++) {
				matrix[i][j] = s.charAt(j - 1) - '0';
			}
		}
		visited = new boolean[N+1][M+1];
		
//		for(int i = 1; i <= N; i++) {
//			for(int j = 1; j <= M; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
		bfs(1, 1);
	
	}
	private static void bfs(int row, int col) {
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(1, 1, 0));
		visited[1][1] = true;
		
		while(!q.isEmpty()) {
			Point cur = q.remove();
			
			
			if(cur.col == M && cur.row == N) {
				System.out.println(cur.dist+1);
			}
			for(int i = 0; i < 4; i++) {
				int nextRow = cur.row + dy[i];
				int nextCol = cur.col + dx[i];
				if(nextRow < 1 || nextCol < 1 || nextCol > M || nextRow > N) {
					continue;
				}
				
				if(!visited[nextRow][nextCol] && matrix[nextRow][nextCol] == 1) {
					q.add(new Point(nextRow, nextCol, cur.dist + 1));
					visited[nextRow][nextCol] = true;
				}
			}
		}
	}
}
