package level1.test;


public class CountPrimeNumber {

	public int solution(int n) {
		int answer = 0;
		boolean decimal = true;
		
		for (int i = 2; i <= n; i++) {
			decimal = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					decimal = false;
					break;
				}
			}
			if(decimal) {
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {

		CountPrimeNumber ad = new CountPrimeNumber();
		System.out.println(ad.solution(5));
		
	}
}
