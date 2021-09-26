package level.math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9020_GoldBerg {

	private static boolean[] arr = new boolean[10001];

	public static void main(String[] args) throws Exception {
		getPrime(); // 소수 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] partition = null;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			partition = getPartition(n);

			for (int j = 0; j < partition.length; j++) {
				bw.write(partition[j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

	private static int[] getPartition(int n) {
		int[] partition = new int[2];
		for (int i = 2; i < n; i++) {
			if(arr[i] == false) {
				for (int j = i; j < n - i; j++) {
					if(i + j == n && arr[j] == false) {
						partition[0] = i;
						partition[1] = j;
					}
				}
			}
		}
		return partition;
	}

	private static void getPrime() {

		arr[0] = true; // 0과 1은 소수가 아니므로 true
		arr[1] = true;
		for (int i = 2; i * i < arr.length; i++) {
			if (arr[i]) {
				continue;
			} 
			for (int j = i * i; j < arr.length; j += i) {
				arr[j] = true;
			}
		}
	}
}