package level.array;

import java.util.HashSet;
import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			h.add(sc.nextInt() % 42);
		// �Է¹��� ���� ������ ���� add �޼ҵ带 ���� HashSet�� ����
		}
		
		System.out.println(h.size());
		
		
	}

}
