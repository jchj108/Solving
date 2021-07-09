package level.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q1546 {

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		double arr[] = new double[sc.nextInt()];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextDouble();
//		}
//
//		double sum = 0;
//		Arrays.sort(arr);
//
//		for (int i = 0; i < arr.length; i++) {
//			sum += ((arr[i] / arr[arr.length - 1]) * 100);
//		}
//		System.out.print(sum / arr.length);
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		int max = 0;
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
			sum += arr[i];
		}
		
		avg = 100.0 * sum / max / T;
		System.out.println(avg);
	}
}
