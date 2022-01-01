package level2.test;

import java.util.Arrays;

public class MakeMin {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2 };
		int[] arr2 = { 5, 4, 4 };

		System.out.println(solution(arr, arr2));

	}

	private static int solution(int[] A, int[] B) {

        int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for (int i = 0; i < A.length; i++) {
			answer += A[A.length - i - 1] * B[i];
		}
		
		return answer;

	}
}
