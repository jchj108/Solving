package level1.test;

import java.util.Scanner;

public class PlusAB {

	public static void main(String[] args) {

//		�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
//		���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
//		���� ����
//		a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
//		a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
//		a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		int sum = 0;
		long max = 0;
		long min = 0;
		
		if (a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		for(long i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
