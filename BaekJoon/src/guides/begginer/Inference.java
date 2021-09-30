package guides.begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inference {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] sequence = new int[N];
		int cd = 0; // 공차
		int cr = 0; // 공비
		boolean flag = false; // true면 등비수열
		
		for(int i = 0; i < N; i++) {
			sequence[i] = Integer.parseInt(br.readLine());
		}
		cd = sequence[1] - sequence[0];
		cr = sequence[1] / sequence[0];
		if(sequence[1] + cd != sequence[2]) {
			flag = true;
		}
		
		if(!flag) {
			System.out.println(sequence[N - 1] + cd);
		} else {
			System.out.println(sequence[N - 1] * cr);
		}
	}
}
