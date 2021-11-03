package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DfsAndBfs {
	
	static int[][] matrix; // ������ķ� �׷��� ����
	static int N;
	static int M;
	static int V;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// �湮�� �� �ִ� ������ �������� ���� ���� ��ȣ�� ���� ���� ���� �湮�ؾ� �Ѵ�.
		
		
		// ���� : ������ ����
		// ���� : ������ ������ ����
		/* DFS (���� �켱 Ž��) : ���� ������ ����� �������� �ϳ��� �� �� �ִ��� �˻��ϰ�,
		         Ư�� �������� �� �� �ִٸ� �� ������ ���� ���� ������ �ݺ� (��͸� ���� ����) */
		
		N = Integer.parseInt(st.nextToken()); // ������ ����
		M = Integer.parseInt(st.nextToken()); // ������ ����
		V = Integer.parseInt(st.nextToken()); // Ž���� ������ ������ ��ȣ

		matrix = new int[N+1][N+1]; // �ε����� ���� ���߱� ���� ��� ũ�� +1
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			matrix[x][y] = 1;
			matrix[y][x] = 1;
		}
		
		dfs(V);
		
	}

	private static void dfs(int v) {
		
		
		
		
	}
}
