package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11726_2xN_tiling {
	static int[] d; // �޸������̼�

	static int dp(int x) {
		if (x == 1) {
			return 1;
		}
		if (x == 2) {
			return 2;
		}
		if (d[x] != 0) { // ���� �̹� ���ߴٸ� �޸������̼ǿ��� ��������
			return d[x];
		}
		return d[x] = (dp(x - 1) + dp(x - 2)) % 10007;
	}

	// Ÿ���� ���� ���ϴ� ����� ��
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		d = new int[n+1];
		System.out.println(dp(n));
	}
}
