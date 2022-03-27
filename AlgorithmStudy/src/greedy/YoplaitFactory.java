package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YoplaitFactory {
	
	static int N; // 운영해야 하는 주
	static int S; // 1주 운영에 드는 비용, 누적 연산 필요
	static int[][] arr; // 우유 1L cost, 필요한 우유 L
	static int cost; // 운영 비용

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 내림차순이면 더 구매
		int prevCost = arr[0][0];
		cost = (prevCost + 5) * arr[0][1]; // 1주차 운영비용
		
		System.out.println(cost);
		
		for(int i = 1; i < arr.length; i++) {
			if(prevCost + 5 < arr[i][0]) { // 보관료를 합한 금액보다 비싸다면 미리 매입
				cost += arr[0][1] * (prevCost + 5); 
			} else {
				prevCost = arr[i][0];
				cost += arr[0][1] * prevCost;
			}
		}
		System.out.println(cost);
		
	}

}
