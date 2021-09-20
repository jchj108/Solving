package level.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2581_PrimeNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int min = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());
		int sum = 0;
		boolean flag = false;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = min; i <= max; i++) {
			flag = true;
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					flag = false;
					break;
				}
			}
			if(flag && i != 1) {
				list.add(i);
				sum+=i;
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(list.get(0));
		}
	}
}
