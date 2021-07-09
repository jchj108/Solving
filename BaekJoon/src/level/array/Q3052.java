package level.array;

import java.util.HashSet;
import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			h.add(sc.nextInt() % 42);
		// 입력받은 값의 나머지 값을 add 메소드를 통해 HashSet에 저장
		}
		
		System.out.println(h.size());
		
		
	}

}
