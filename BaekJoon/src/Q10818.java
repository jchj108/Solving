import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt(); // ù ��° �Է°�
		int[] arr = new int[input]; // �迭�� ���� = �Է°��� ����
		int max = -1_000_000;
		int min = 1_000_000;
		
		for (int i = 0; i<arr.length; i++) { 
			arr[i] = sc.nextInt(); // �迭�� �� �ε����� �Է°� �ֱ�
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
