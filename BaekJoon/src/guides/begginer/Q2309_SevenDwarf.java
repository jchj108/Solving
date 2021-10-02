package guides.begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2309_SevenDwarf {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int[9];
		int sum = 0;
		for (int i=0; i<9; i++) { 
			nums[i] = Integer.parseInt(br.readLine());
			sum += nums[i];
		}
		loop : for (int i=0; i<8; i++) {
			for (int j=i+1; j<9; j++) {
				if (sum-nums[i]-nums[j] == 100) {
					nums[i] = nums[j] = 0;
					break loop;
				}
			}
		}
		Arrays.sort(nums);
		for (int i=2; i<9; i++)
			System.out.println(nums[i]);
	}
}