package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Virus {
	
	static int count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // ����(��ǻ��)�� ����
		int m = Integer.parseInt(br.readLine()); // ������ ����
		int v = 1; // Ž���� ������ ��ǻ�� ��ȣ
		
		int[][] matrix = new int[n+1][n+1];
		boolean[] visited = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			matrix[x][y] = 1;
			matrix[y][x] = 1;
		}
		bfs(v, matrix, visited);
		System.out.println(count);
	}

	private static void bfs(int v, int[][] matrix, boolean[] visited) {
		visited[v] = true;
		
		for(int i = 1; i < matrix.length; i++) {
			if(matrix[v][i] == 1 && !visited[i]) { // ������� ���η� Ž��, v�� ��͸� ���鼭 �ٲ�
				bfs(i, matrix, visited);
				count++;
			}
		}
		
	}
}
