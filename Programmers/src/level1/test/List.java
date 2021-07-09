package level1.test;

import java.util.Scanner;

public class List {

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		long j = x;
		for (int i = 0; i < answer.length; i++) {
			answer[i] = j;
			j += x;
		}
		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		solution(2, 5);
		
//		Scanner sc = new Scanner(System.in);
//
//		int x = sc.nextInt();
//		int n = sc.nextInt();
//		int j = x;
//
//		int[] iArr = new int[n];
//
//		for (int i = 0; i < iArr.length; i++) {
//				iArr[i] = j;
//				j+=x;
//			}
//		
//		for (int i = 0; i < iArr.length; i++) {
//			System.out.println(iArr[i]);
//		}
	}
}
