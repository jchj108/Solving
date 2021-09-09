package level.recursive;

public class Q10872_Factorial {

	public static void main(String[] args) {
		int i, j;

		for (j = 1, i = 1; i <= 10; i++) { // j=0으로시작,i는 1부터시작해서i<=0만족할때까지 반복,i증가

			j = j * i;
			System.out.print(i);
			if (i == 10) { // 10이면 +대신 =출력하고 덧셈의합을 출력
				System.out.print("=");
				System.out.print(j);
			} else // 1~9까지는 + 출력
				System.out.print("*");
		}
	}
}
