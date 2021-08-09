package level2.test;

public class Fibonacci {

    public int solution(int n) {
        
        return fibo(n);
    }
	
	private int fibo(int n) {
		if(n <= 1) {
			return n;
		} else {
			return fibo(n-2) % 1234567 + fibo(n-1) % 1234567;
		}
	}
	
	public static void main(String[] args) {
		int result = new Fibonacci().solution(11);
		System.out.println(result);
	}
}
