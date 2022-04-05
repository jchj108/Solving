package backtrackking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NnM1_15649 {

	static int[] nums = new int[10];
	static boolean[] isused = new boolean[10];
	static int M;
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		// 1부터 N까지의 수 중 중복 없이 M개를 고른 수열
		set(0);
		

	}

	private static void set(int depth) {
		
		if(depth == M) {
			// 모든 수 선택 완료
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] != 0) {
					System.out.print(nums[i] + " ");
				}
			}
			System.out.println();
			
		} else {
			for(int i = 1; i <= N; i++) {
				if(!isused[i]) {
					nums[depth] = i;
					isused[i] = true;
					set(depth+1);
					isused[i] = false;
				}
			}
		}
	}

}
