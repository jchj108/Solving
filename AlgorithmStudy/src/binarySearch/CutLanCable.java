package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CutLanCable {

	static int K, N;
	static long max;
	static int[] arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		K = Integer.parseInt(st.nextToken()); // 현재 랜선 개수
		N = Integer.parseInt(st.nextToken()); // 잘라서 만들어야 하는 랜선 개수

		arr = new int[K];

		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		// 0으로 나누는 일을 방지하기 위해 max + 1
		max++;

		long min = 0;
		long mid = 0;

		while (min < max) {

			// 범위 내에서 중간 길이 구하기
			mid = (max + min) / 2;

			long count = 0;

			for (int i = 0; i < arr.length; i++) {
				count += arr[i] / mid;
			}

			if (count < N) {
				max = mid;
			} else {
				min = mid + 1;
			}

		}
		System.out.println(min - 1);

	}

}
