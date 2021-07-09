package level1.test;

import java.util.Scanner;

public class ArrayDelete {

	private static int[] solution(int[] arr) {
		if (arr.length == 1) {
			return new int[] { -1 };
		}

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		
		int[] answer = new int[arr.length - 1];
		int j = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				continue;
			} 
			answer[j++] = arr[i];
		}
		return answer;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 15, 2, 33, 5 };

		int[] result = {};
		result = ArrayDelete.solution(arr1);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}