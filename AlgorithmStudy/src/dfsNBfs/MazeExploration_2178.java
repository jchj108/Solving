package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MazeExploration_2178 {
	// 미로탐색
	static int N, M; // row, col
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, 1 };
	static int[][] matrix;
	static boolean[][] visited;
	static class Point {
		int row, col, dist;
		Point(int r, int c, int d) {
			row = r;
			col = c;
			dist = d;
		}
	}
	public static void main(String[] args) throws IOException {
		// 1은 이동 가능, 0은 불가
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		matrix = new int[N+1][M+1];
		for (int i = 1; i < N; i++) {
			String s = br.readLine();
			for (int j = 1; j < M; j++) {
				matrix[i][j] = s.charAt(j - 1) - '0';
			}
		}
		visited = new boolean[N+1][M+1];
		int sRow, sCol, dRow, dCol;
		sRow = 1;
		sCol = 1;
		dRow = N; // 도착위치
		dCol = M;
		System.out.println(bfs(sRow, sCol, dRow, dCol));
		
	}

	private static int bfs(int sRow, int sCol, int dRow, int dCol) {
		
		Queue<Point> q = new LinkedList<>();
		visited[sRow][sCol] = true;
		q.add(new Point(sRow, sCol, 0));
		
		while(!q.isEmpty()) {
			Point curr = q.remove();
			if (curr.row == dRow && curr.col == dCol) {
				return curr.dist;
			}
			for(int i = 0 ; i < 4; i++) {
				int nr = curr.row+dx[i]; // nextRow
				int nc = curr.col+dy[i]; // nextCol
				if(nr < 0 || nr > N-1||nc<0||nc>N-1) {
					continue;
				}
				if(visited[nr][nc] ) {
					continue;
				}
				visited[nr][nc] = true;
				q.add(new Point(nr, nc, curr.dist+1));
			}
		}
		return -1;
	}
}
