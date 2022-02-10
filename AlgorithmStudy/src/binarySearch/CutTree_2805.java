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

		long pr = 0;
		for (int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			if (tree[i] > pr) {
				pr = tree[i];
			}
		}

		pr++; // pc가 0인 경우를 방지하기 위해 +1을 해준다 ex. pl = 0, pr = 1 : 0+1/2 : 0
		long pl = 0;
		long pc = 0;

		while (pl < pr) {
			pc = (pl + pr) / 2;
			
			long cut = 0;
			
			for(int i = 0; i < tree.length; i++) {
				if(tree[i] - pc > 0) {
					cut += tree[i] - pc; 
				}
			}
			
			if(cut < M) {
				pr = pc; // 검색 범위 오른쪽을 반으로 좁힘
			} else {
				pl = pc + 1; // 검색 범위 왼쪽을 반으로 좁히고 + 1
				// +1을 해주지 않으면 양쪽 범위의 차이가 1일 때 무한 루프에 빠지게 된다.
				// pl(15) + pr(16) / 2 : 15
				
			}
		}
		System.out.println(pr-1); // 처음에 +1을 해줬기 때문에 -1
		System.out.println(pl-1);
	}
}
