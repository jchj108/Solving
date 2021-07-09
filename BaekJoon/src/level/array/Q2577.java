package level.array;

import java.util.Scanner;

public class Q2577 {

	public static void main(String[] args) {
		
		//valueOf(number) : 해당 number를 String으로 변환하여 반환합니다.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int[] arr = new int[10];
		String input = String.valueOf(a*b*c);
		for (int i=0; i<input.length(); i++) {
			arr[input.charAt(i) - '0']++;
		}
		
		for (int i=0; i<arr.length; ++i) {
			System.out.println(arr[i]);
		}
		
	}
}
