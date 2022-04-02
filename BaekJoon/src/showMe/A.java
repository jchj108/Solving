package showMe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
	
	static int N; 
	static int[] c;
	static boolean[] visited;
	static int[][] matrix;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		c = new int[N];
		visited = new boolean[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		
		dfs(0);
	}

	private static void dfs(int v) {
		visited[v] = true;
		
		for(int i = 0; i < N; i++) {
			
		}
	}
	
}
