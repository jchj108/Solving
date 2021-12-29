package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi_11729 {

	static int N;
	static int count;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine()); // 원판의 개수

		hanoi(1, 2, 3, N);

	}

	private static void hanoi(int i, int j, int k, int N) {
		
		
		
	}
}
