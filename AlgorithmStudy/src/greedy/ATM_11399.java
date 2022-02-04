package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM_11399 {

	static int N;
	static int[] p;
	static long result;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		/*
		 * 5
			3 1 4 3 2
		 * 
		 */
		p = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(p);
		
		int sum = 0;
		for (int i : p) {
			sum += i;
			result += sum;
		}
		System.out.println(result);
	}
}
