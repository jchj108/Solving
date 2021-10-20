package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3085_CandyGame {

	public static char[][] arr; // 사탕 지도
	public static int N; // arr 크기
	public static int max = 0; // 먹을 수 있는 사탕 개수

	public static void swap(char a, char b) { // 한 글자 스왑 메소드
		char temp = a;
		a = b;
		b = temp;
	}

	public static void check() {

		for (int i = 0; i < arr.length - 1; i++) { // 가로 체크
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

		for (int i = 0; i < arr.length - 1; i++) { // 세로 체크
			int count = 1;
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[i][j] == arr[i + 1][j]) { // 행 검사
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
		
		for(int i = 0; i < N; i++) { // 가로 교환하고 max 찾고 원위치
			for(int j = 0; j < N-1; j++) {
//				swap(arr[i][j], arr[i][j+1]); // 가로 스왑
				char temp = arr[i][j];
				arr[i][j] = arr[i][j+1];
				arr[i][j+1] = temp;
				check();
//				swap(arr[i][j], arr[i][j+1]); // 원위치
				temp = arr[i][j];
				arr[i][j] = arr[i][j+1];
				arr[i][j+1] = temp;
			}
		}
		
		for(int i = 0; i < N; i++) { // 세로 교환하고 max 찾고 원위치
			for(int j = 0; j < N-1; j++) {
//				swap(arr[j][i], arr[j+1][i]); // 가로 스왑
				char temp = arr[j][i];
				arr[j][i] = arr[j+1][i];
				arr[j+1][i] = temp;
				check();
//				swap(arr[j][i], arr[j+1][i]); // 원위치
				temp = arr[j][i];
				arr[j][i] = arr[j+1][i];
				arr[j+1][i] = temp;
			}
		}
		System.out.println(max);
	}
}
