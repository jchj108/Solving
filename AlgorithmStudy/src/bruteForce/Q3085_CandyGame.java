package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3085_CandyGame {

	public static char[][] arr; // ���� ����
	public static int N; // arr ũ��
	public static int max = 0; // ���� �� �ִ� ���� ����

	public static void swap(char a, char b) { // �� ���� ���� �޼ҵ�
		char temp = a;
		a = b;
		b = temp;
	}

	public static void check() {

		for (int i = 0; i < arr.length - 1; i++) { // ���� üũ
			int count = 1;
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[i][j] == arr[i][j + 1]) {
					count++;
				} else {
					count = 1;
				}
				max = Math.max(max, count);
			}
		}

		for (int i = 0; i < arr.length - 1; i++) { // ���� üũ
			int count = 1;
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[i][j] == arr[i + 1][j]) { // �� �˻�
					count++;
				} else {
					count = 1;
				}
				max = Math.max(max, count);
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new char[N][N];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) { // ���� ��ȯ�ϰ� max ã�� ����ġ
			for(int j = 0; j < N-1; j++) {
//				swap(arr[i][j], arr[i][j+1]); // ���� ����
				char temp = arr[i][j];
				arr[i][j] = arr[i][j+1];
				arr[i][j+1] = temp;
				check();
//				swap(arr[i][j], arr[i][j+1]); // ����ġ
				temp = arr[i][j];
				arr[i][j] = arr[i][j+1];
				arr[i][j+1] = temp;
			}
		}
		
		for(int i = 0; i < N; i++) { // ���� ��ȯ�ϰ� max ã�� ����ġ
			for(int j = 0; j < N-1; j++) {
//				swap(arr[j][i], arr[j+1][i]); // ���� ����
				char temp = arr[j][i];
				arr[j][i] = arr[j+1][i];
				arr[j+1][i] = temp;
				check();
//				swap(arr[j][i], arr[j+1][i]); // ����ġ
				temp = arr[j][i];
				arr[j][i] = arr[j+1][i];
				arr[j+1][i] = temp;
			}
		}
		System.out.println(max);
	}
}
