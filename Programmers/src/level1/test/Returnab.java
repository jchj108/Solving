package level1.test;

import java.util.Scanner;

public class Returnab {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	long b = sc.nextLong();
	long sum = 0;
	
		if (a<b) {
			for (long i=a; i<=b; i++) {
			sum = sum + i;
			}
		}
		else {
			for (long i=b; i<=a; i++) {
			sum = sum + i;
			}
		}
		
		
		System.out.println(sum);
	}
}		
