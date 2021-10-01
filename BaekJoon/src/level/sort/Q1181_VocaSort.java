package level.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1181_VocaSort {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// https://st-lab.tistory.com/112 ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() { // T�� Type�� �̾߱��ϸ� ��ü, �ڷ��� ���� Ÿ�� �� �ϳ��� ������ �� �ִٴ� ��
			@Override
			public int compare(String s1, String s2) { // compare�� ���� int�� 0 �̻��̸� �ڸ��ٲ�, 0�̰ų� 0���ϸ� �������� �ʴ´�.
				// ���̰� ���� ���
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2); // ���� �� ���� 
				} 
				// �� ���� ���
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(arr[0]);
		for(int i = 1; i < N; i++) { // �ߺ� ó��
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}
	}
}