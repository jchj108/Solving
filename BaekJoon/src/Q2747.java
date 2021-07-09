import java.util.Scanner;

public class Q2747 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int a = 1;
		int b = 1;
		int c = 2;
		
		
		
		for (int i = 0; i<n-1; i++) {
			
		c = a + b;
		a = b;
		b = c;
		}
		System.out.println(a);
	}
}
