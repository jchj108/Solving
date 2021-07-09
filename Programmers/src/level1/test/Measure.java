package level1.test;

import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] answer = new int[2];
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max, min;
		if (n > m) {
			max = n;
			min = m;
		} else {
			max = m;
			min = n;
		}
		answer[0] = gcd(max, min);
		answer[1] = max*min/answer[0];
		
		for(int i:answer) {
			System.out.println(i);
		}
		
	}

	public static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}
}
