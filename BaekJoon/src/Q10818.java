import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt(); // 첫 번째 입력값
		int[] arr = new int[input]; // 배열의 길이 = 입력값의 길이
		int max = -1_000_000;
		int min = 1_000_000;
		
		for (int i = 0; i<arr.length; i++) { 
			arr[i] = sc.nextInt(); // 배열의 각 인덱스에 입력값 넣기
		}
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
				
		
		}
        System.out.println(min + " " + max);

		
	}
}	
