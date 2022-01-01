package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class OrganicCabbage_1012 {

	static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { -1, 0, 1, 0 };
	static int[][] matrix;
	static boolean[][] visited;
	static int N, M, K;
	static int count;
	static class Dot {
		int x, y;
		Dot(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken()); // Col 가로 길이
			N = Integer.parseInt(st.nextToken()); // Row 세로길이
			K = Integer.parseInt(st.nextToken());
			visited = new boolean[M][N];
			matrix = new int[M][N];
			count = 0;
			for(int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());				
				matrix[x][y] = 1;
			}
 
			for(int j = 0; j < M; j++) {
				for(int k = 0; k < N; k++) {
					if (matrix[j][k] == 1 && !visited[j][k]) {
						bfs(j, k);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	private static void bfs(int x, int y) {
		Queue<Dot> q = new LinkedList<Dot>();
		q.add(new Dot(x, y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			Dot cur = q.remove();
			
			for(int i = 0; i < 4; i++) {
				int nextX = cur.x + dx[i];
				int nextY = cur.y + dy[i];
				
				if(nextX >= 0 && nextY >= 0 && nextX < M && nextY < N && !visited[nextX][nextY] && matrix[nextX][nextY] == 1) {
					q.add(new Dot(nextX, nextY));
					visited[nextX][nextY] = true;
				}
			}
		}
	}
    	
}
