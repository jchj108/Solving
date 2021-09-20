package level.function;

public class Q4673_SelfNumber {

	public static void main(String[] args) {

		boolean[] check = new boolean[10001]; // 1부터 10000

		for (int i = 1; i < 10001; i++) {
			int n = d(i);

			if (n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

	private static int d(int number) {
		int sum = number;

		while (number != 0) {
			sum = sum + (number % 10); // 1234가 들어왔을 때 나머지는 4
			number = number / 10; // 123의 자리수 구하기.. 반복
		}

		return sum;
	}
}
