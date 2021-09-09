package level.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10872_FactorialRecursive {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = factorial(Integer.parseInt(br.readLine()));
		
		System.out.println(result);
	}

	private static int factorial(int recur) {
		if(recur == 0) {
			return 1;
		}
		if (recur <= 1) {
			return recur;
		} else {
			return factorial(recur - 1) * recur; // ��ͽ� recur(10)�� ������� �ʰ� ���δ�.
		}
	}
}
