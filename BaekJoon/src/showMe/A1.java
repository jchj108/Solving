package showMe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1 {
	static int N; 
	static int[] c;
	static boolean[] visited;
	static int[][] matrix;
	static int cost;
	static int subCost;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		c = new int[N];
		visited = new boolean[N];
		matrix = new int[N][N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			c[i] = Integer.parseInt(st.nextToken());
			cost += c[i];
		}
		
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			for(int j = 0; j < temp; j++) {
				st = new StringTokenizer(br.readLine());
				matrix[i][Integer.parseInt(st.nextToken())-1] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = Integer.MAX_VALUE;
		
		for(int i = 0; i < N; i++) {
			dfs(i, 0); 
			Arrays.fill(visited, false);
			if(max > subCost) {
				max = subCost;
			}
			subCost = 0;
		}
		System.out.println(max);
	}

	private static void dfs(int v, int sale) {
		
		subCost += c[v] - sale;
		visited[v] = true;
		
		for(int i = 0; i < N; i++) {
			if(!visited[i]) {
				int sum = 0;
				for(int k = 0; k < matrix.length; k++) {
					sum += matrix[k][i];
					if(sum >= c[i]) {
						sum = c[i] - 1;
						break;
					}
				}
				dfs(i, sum);
			}
		}
	}
}
