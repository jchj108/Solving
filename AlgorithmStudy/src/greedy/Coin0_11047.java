package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Coin0_11047 {

	static int N, K;
	static ArrayList<Integer> coinList = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		
		N = Integer.parseInt(s[0]);
		K = Integer.parseInt(s[1]);
		
		
		for(int i = 0; i < N; i++) {
			int coin = Integer.parseInt(br.readLine());
			if(coin <= K) {
				coinList.add(coin);
			}
		}
		
		int count = 0;
		while(K > 0) {
			int topIndex = coinList.size()-1;
			
			if(coinList.get(topIndex) <= K) {
				K -= coinList.get(topIndex);
				count++;
			} else {
				coinList.remove(topIndex);
			}
		}
		System.out.println(count);
	}
}
