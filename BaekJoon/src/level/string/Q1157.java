package level.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];

		String s = br.readLine();
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a'] += 1;
		}


		int max = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
		}
		char c = ' ';
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				c = (char) (i + 'a');
			}
		}
		// 내림차순 bubble sort
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		if (arr.length != 1 && arr[0] == arr[1]) {
			System.out.println("?");
		} else {
			System.out.println(Character.toUpperCase(c));
		}
	}
}
