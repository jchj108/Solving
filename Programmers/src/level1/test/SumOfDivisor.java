package level1.test;

public class SumOfDivisor {

	public int solution(int n) {
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		SumOfDivisor sod = new SumOfDivisor();
		sod.solution(0);
	}
}
