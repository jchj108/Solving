package level1.test;

import java.util.Scanner;

public class Squared {

	public long solution(long n) {
		long root = (long) Math.sqrt(n);

		if (n == Math.pow(root, 2)) {
			return (long) Math.pow(root + 1, 2);
		}

		return -1;
	}

	public static void main(String[] args) {
	}
}