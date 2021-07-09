package level1.test;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = 0;
		int count = 0;

		while (n!=1) {
			if (n % 2 == 0) {
				n = n / 2;
				count++;
				if(count>500) {
					count = -1;
					break;
				}
			} else {
				n = n * 3 + 1;
				count++;
				if(count>500) {
					count = -1;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
