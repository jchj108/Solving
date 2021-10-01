package level.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이분 탐색
public class Q1920_FindNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		int[] arr2 = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < arr2.length; i++) {
			if(binarySearch(arr2[i], arr)) {
				bw.write("1\n");
			} else {
				bw.write("0\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean binarySearch(int num, int[] arr) {
		int left = 0; // 검색 범위의 맨 앞 인덱스
		int right = arr.length - 1; // 검색 범위의 맨 끝 인덱스

		while(left <= right) {
			int center = (left + right) / 2;
			if(arr[center] == num) {
				return true;
			} else if(arr[center] < num) {
				left = center + 1; // +1과 -1을 해주는 이유는 pc == num 비교가 이전에 수행되었기 때문이고, 무한 루프를 돌기 때문 
			} else {
				right = center - 1;
			}
		}
		return false;
	}
}
