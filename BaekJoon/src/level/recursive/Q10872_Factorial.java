package level.recursive;

public class Q10872_Factorial {

	public static void main(String[] args) {
		int i, j;

		for (j = 1, i = 1; i <= 10; i++) { // j=0���ν���,i�� 1���ͽ����ؼ�i<=0�����Ҷ����� �ݺ�,i����

			j = j * i;
			System.out.print(i);
			if (i == 10) { // 10�̸� +��� =����ϰ� ���������� ���
				System.out.print("=");
				System.out.print(j);
			} else // 1~9������ + ���
				System.out.print("*");
		}
	}
}
