package level.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1181_VocaSort {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// https://st-lab.tistory.com/112 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() { // T는 Type을 이야기하며 객체, 자료형 등의 타입 중 하나를 설정할 수 있다는 것
			@Override
			public int compare(String s1, String s2) { // compare의 리턴 int가 0 이상이면 자리바꿈, 0이거나 0이하면 정렬하지 않는다.
				// 길이가 같은 경우
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2); // 사전 순 정렬 
				} 
				// 그 외의 경우
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(arr[0]);
		for(int i = 1; i < N; i++) { // 중복 처리
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}
	}
}