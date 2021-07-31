package level1.test;

public class CountDivisorAndAdd {

	public int solution(int left, int right) {
		int answer = 0;
		
		for(int i = left; i <= right; i++) {
			if(isDivisor(i)) {
				answer += i;
			} else {
				answer -= i;
			}
		}
		
		return answer;
	}

	private static boolean isDivisor(int n) {

		// 약수의 개수가 짝수면 true
		if (n == 1) { // n이 1이면 false
			return false;
		}
		int count = 2;
		for (int i = 2; i < n / 2 + 1; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		
		 return (count % 2 == 0) ? true : false;
	}

	public static void main(String[] args) {

		int reuslt = new CountDivisorAndAdd().solution(13, 17);
		System.out.println(reuslt);
	}
}
