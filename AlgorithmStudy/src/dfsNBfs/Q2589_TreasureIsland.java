package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2589_TreasureIsland {
	
	static int row, col;
	static int[] dx = {0, -1, 0, 1}; // col
	static int[] dy = {-1, 0, 1, 0}; // row
	static int matrix[][];
	static boolean[][] visited;
	
	static class Dot {
		int x, y, dist;
		Dot(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		matrix = new int[row+1][col+1];
		
		for(int i = 1; i <= row; i++) {
			String s = br.readLine();
			for(int j = 1; j <= col; j++) {
				if(s.charAt(j-1) == 'L') { // L = Land
					matrix[i][j] = 1;
				}
			}
		}
		
		int result = 0;
		
		for(int i = 1; i < matrix.length; i++) {
			for(int j = 1; j < matrix[i].length; j++) {
				if(matrix[i][j]==1) {
					visited = new boolean[row+1][col+1];
					int val = bfs(i,j);
					result = Math.max(val, result);
				}
			}
		}
		
//		show();
		System.out.println(result);
	}

	private static void show() {
		for(int i = 1; i < matrix.length; i++) {
			for(int j = 1; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

	private static int bfs(int x, int y) {
		Queue<Dot> q = new LinkedList<Dot>();
		q.add(new Dot(x, y, 0));
		visited[x][y] = true;
		int val = 0;
		
		while(!q.isEmpty()) {
			Dot cur = q.remove();
			for(int i = 0; i < 4; i++) {
				int nextR = cur.x + dx[i]; 
				int nextC = cur.y + dy[i];

				if(nextR > 0 && nextC > 0 && nextR < row + 1 && nextC < col + 1 && !visited[nextR][nextC] && matrix[nextR][nextC] == 1) {
					q.add(new Dot(nextR, nextC, cur.dist+1));
					visited[nextR][nextC] = true;
					val = Math.max(val, cur.dist + 1);
				}
			}
		}
		return val;
	}
}
