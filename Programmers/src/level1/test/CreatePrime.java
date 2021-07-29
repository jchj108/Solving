package level1.test;

import java.util.ArrayList;

public class CreatePrime {

	public int solution(int[] nums) {

		int answer = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				for(int k = j+1; k < nums.length; k++) {
					int n = nums[i] + nums[j] + nums[k];
					if(isPrime(n)) {
						list.add(n);
						answer++;
					}
				}
			}
			
		}
		
		for(int i : list) {
			System.out.println(i);
		}
		
		
		return answer;
	}
	
	private boolean isPrime(int n) {

		for(int i = 2; i < n/2; i++) { // 루트 n까지만 비교해도 된다.
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}



	public static void main(String[] args) {
		int result = new CreatePrime().solution(new int[] { 1,2,3,4 });
		System.out.println(result);
	}
}
