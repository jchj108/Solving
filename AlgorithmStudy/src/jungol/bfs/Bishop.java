package jungol.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bishop {
	static int N;
	static int[][] map;
	static int[][] position;
	static boolean[][] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine().trim());

		map = new int[N][N];
		position = new int[N][N];
		visited = new boolean[N][N];

		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bfs(0, 0, 0);
	}


	private static void bfs(int index, int j, int k) {
		
	}


	private static void print() {
		for (int i = 0; i < position.length; i++) {
			for (int j = 0; j < position.length; j++) {
				System.out.print(position[i][j]);
			}
			System.out.println();
		}
	}

	private static boolean isSafe() {

		return true;
	}
}
