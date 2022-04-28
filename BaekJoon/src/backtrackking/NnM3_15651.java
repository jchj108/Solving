package backtrackking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class NnM3_15651 {

	static int N;
	static int M;
	static int[] nums;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		nums = new int[M+1];
		
		// 1 ~ N 수 중에서 길이가 M인 중복 수열 구하기
		bfs(0);
		bw.close();
	}

	private static void bfs(int depth) throws IOException {
		if (depth == M) {
			print();
			return;
		} 
		
		for (int i = 1; i <= N; i++) {
			nums[depth] = i;
			bfs(depth + 1);
		}
	}

	private static void print() throws IOException {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				bw.write(nums[i] + " ");
			}
		}
		bw.write("\n");
	}
}
