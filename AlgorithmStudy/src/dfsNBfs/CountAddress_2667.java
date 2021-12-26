package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountAddress_2667 {

	static int[][] matrix;
	static boolean[][] visited;
	static int N;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	static int count;
	static int[] apartsArr = new int[25*25];
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		matrix = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			for(int j = 0; j < s.length(); j++) {
				matrix[i][j] = s.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(matrix[i][j] == 1 && !visited[i][j]) {
					count++;
					dfs(i,j);
				}
			}
		}
		Arrays.sort(apartsArr);
		System.out.println(count);
		
		for(int i = 0; i < apartsArr.length; i++) {
			if(apartsArr[i] != 0) {
				System.out.println(apartsArr[i]);
			}
		}
		
	}

	private static void dfs(int x, int y) {
		visited[x][y] = true;
		apartsArr[count]++; 
		
		for(int i = 0; i < 4; i++) {
			int nextRow = x + dx[i];
			int nextCol = y + dy[i];
			
			if(nextRow < 0 || nextRow >= N || nextCol < 0 || nextCol >= N) {
				continue;
			}
			if(matrix[nextRow][nextCol] == 1 && !visited[nextRow][nextCol]) {
				dfs(nextRow,nextCol);
			}
			
		}
		
	}

}
