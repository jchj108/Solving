package level.array;

import java.util.Scanner;

public class Q8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String[] arr = new String[sc.nextInt()];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextLine(); // 버퍼에 \n이 남아 정상실행되지 않는다.
//		}
		
		String[] arr = new String[sc.nextInt()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			int sum = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count; // J가 돌 때마다 sum에 추가 된다.
			}
			System.out.println(sum);
		}
	}
}