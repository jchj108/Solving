package level.calculations;

import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	int num1 = sc.nextInt();
	String num2 = sc.next();

	int a = num2.charAt(0) - '0';
	int b = num2.charAt(1) - '0';
	int c = num2.charAt(2) - '0';
	
	int sum1 = num1*c;
	int sum2 = num1*b;
	int sum3 = num1*a;
	
	System.out.println(sum1);
	System.out.println(sum2);
	System.out.println(sum3);
	System.out.println(num1 * Integer.parseInt(num2));
	}	
}
