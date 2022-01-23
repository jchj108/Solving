package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CutTree_2805 {

	static int N, M;
	static int[] tree;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		tree = new int[N];

		long max = 0;
		for (int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			if (tree[i] > max) {
				max = tree[i];
			}
		}

		max++;
		long min = 0;
		long mid = 0;

		while (min < max) {
			// 범위 내에서 중간 길이 구하기
			mid = (min + max) / 2;
			
			long cut = 0;
			
			for(int i = 0; i < tree.length; i++) {
				if(tree[i] - mid > 0) {
					cut += tree[i] - mid; 
				}
			}
			
			if(cut < M) {
				max = mid;
			} else {
				min = mid+1;
			}
		}
		System.out.println(max-1);
	}
}
