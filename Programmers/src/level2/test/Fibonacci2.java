package level2.test;

public class Fibonacci2 {

	public int solution(int n) {

		int prev = 0;
		int next = 1;
		
		for(int i = 0; i < n; i++) {
			int sum = prev + next;
			prev = next;
			next = sum;
		}
		return prev % 1234567;
	}
	
	public static void main(String[] args) {
		System.out.println(new Fibonacci2().solution(5));
	}
}
