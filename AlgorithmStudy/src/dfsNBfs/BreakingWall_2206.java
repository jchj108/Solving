package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BreakingWall_2206 {

	static int N, M;
	static int[][] matrix;
	static boolean[][][] visited;
	static int dx[] = { 0, -1, 0, 1 };
	static int dy[] = { -1, 0, 1, 0 };

	static class Dot {
		int x, y, dist;
		boolean destoryed;
		
		Dot(int x, int y, int dist, boolean destroyed) {
			this.x = x;
			this.y = y;
			this.dist = dist;
			this.destoryed = destroyed;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		matrix = new int[N][M];
		visited = new boolean[N][N][2];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				matrix[i][j] = s.charAt(j) - '0';
			}
		}
		int result = 0;
		result = bfs();
		
		System.out.println(result);
	}

	private static int bfs() {
		LinkedList<Dot> q = new LinkedList<Dot>();
		q.add(new Dot(0, 0, 0, false)); // Dot == x, y, dist, destroyed
		visited[0][0][0] = true; // 0일 때는 부수지 않고 이동

		while (q.isEmpty()) {
			Dot cur = q.remove();

			if (cur.x == M - 1 && cur.y == N - 1) {
				return cur.dist;
			}
			
			for(int i = 0; i < 4; i++) {
				int nextX = cur.x + dx[i];
				int nextY = cur.y + dy[i];
				
				if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < M) {
					if(!cur.destoryed && matrix[nextX][nextY] == 0) {
						
						
						
					}
				}
			}

		}

		return -1;
	}
}
