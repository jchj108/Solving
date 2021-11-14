package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OrganicCabbage_1012 {

    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
	static int[][] matrix;
	static boolean[][] visited;
	static int[][] arr;
	static int N;
	static int M;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int count = 0;
			arr = new int[N][M];
			for(int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				matrix[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}
			
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < M; k++) {
					if (arr[j][k] != 0) {
						dfs(j, k);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	

    public static void dfs(int X, int Y) {
 
        for (int i = 0; i < 4; i++) {
            //다음 방문지 nextX,와 nextY
            int nextX = X + dx[i];
            int nextY = Y + dy[i];
 
            //nextX, nextY가 범위를 벗어난다면 그냥 통과한다.
            if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                continue;
            }
            //다음 방문할 값이 0 이라면 그냥 통과한다.
            if (arr[nextX][nextY] == 0) {
                continue;
            }
            //방문한점은 0으로 바꿔준다.
            arr[nextX][nextY] = 0;
            dfs(nextX, nextY);
        }
    }
}
