package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tomato_7576 {
	
	static int N, M;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken()); // 상자의 가로 칸 수
		N = Integer.parseInt(st.nextToken()); // 상자의 세로 칸 수
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
		}
		
		
	}

}
