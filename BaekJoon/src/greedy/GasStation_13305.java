package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GasStation_13305 {
	
	static int N;
	static long[] dist;
	static long[] cost;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 도시의 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		dist = new long[N-1];
		cost = new long[N];
		
		for(int i = 0; i < N-1; i++) {
			dist[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}
		
		// 남아 있는 도시중 현재 도시가 가장 싸다면 현재 도시에서 모든 기름 구매
		// 그렇지 않은 경우 현재 도시에서 다음 도시로 이동할 수 있는 기름만 구매
		// 마지막 도시의 가격은 무의미
		
		/*
		 * 1. 최소 가격인 도시에 도착할 때까지 현재 도시에서 최소한만 사는 건 무의미 (부분적으로 이득을 볼 수 없기 때문)
		 * 2. 그러면 어떻게 부분적으로도 최적의 값을 구할 수 있나?
		 * 3. 내림차순으로 정렬되어 있을 경우 구매
		 */
		long sum = 0;
		long minCost = cost[0];
		
		for(int i = 0; i < N - 1; i++) { // 마지막 도시의 가격은 무시
			if(cost[i] < minCost) {
				minCost = cost[i];
			}
			
			sum += (minCost * dist[i]); // 현재 도시가 아닌 현재까지 지나온 가장 저렴한 기름을 구매
		}
		
		System.out.println(sum);
		
	}

}
