package guides.begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1834_SameMod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());
		ArrayList<Long> list = new ArrayList<Long>();
		long result = 0;
		// 나머지 구하기..
		for(long i = 0; i < N; i++) {
			result += N * i + i;
		}
		System.out.println(result);
	}
}
