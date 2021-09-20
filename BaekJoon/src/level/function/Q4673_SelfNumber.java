package level.function;

public class Q4673_SelfNumber {

	public static void main(String[] args) {

		boolean[] check = new boolean[10001]; // 1���� 10000

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
			sum = sum + (number % 10); // 1234�� ������ �� �������� 4
			number = number / 10; // 123�� �ڸ��� ���ϱ�.. �ݺ�
		}

		return sum;
	}
}
