package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinVendingMachine {
	
	static int[] coins;
	static int[] cost = new int[] {500, 100, 50, 10, 5, 1};
	static int W;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		W = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = 0;
		coins = new int[6];
		for(int i = 0; i < coins.length; i++) {
			coins[i] = Integer.parseInt(st.nextToken());
			max += coins[i] * cost[i];
		}
		
		max -= W;
		
		int index = 0;
		while(true) {
			
			if(max <= 0) {
				break;
			}
			
			if(coins[index] == 0 || max < cost[index]) {
				index++;
				continue;
			}
				
			max -= cost[index];
			coins[index]--;
		}
		
		int sum = 0;
		for(int coin : coins)
			sum += coin;
		
		System.out.println(sum);
		for(int coin : coins)
			System.out.printf("%d ", coin);
	}

}
