package level.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1002_Turret {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// r1, r2는 자연수이므로 대각선 거리를 구해준 뒤 실수 정수 비교를 통해 실수는 버린다. 
		// 실수 정수 비교는 실수에 %1을 해줘서 나머지가 있다면 실수이다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] coord1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			int r1 = Integer.parseInt(st.nextToken());
			int[] coord2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			int r2 = Integer.parseInt(st.nextToken());
			
			// coord1[0]제곱 + coord1[1]제곱 == 루트r1이 정수라면 점은 삼각형(무한대)
			
		}
	}
}
