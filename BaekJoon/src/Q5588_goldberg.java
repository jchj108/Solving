import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q5588_goldberg {
	
	private int[] findPrime(int[] arr) {

		for(int i = 0; i*i < arr[i]; i++) {
			
		}
		
		return null;
	}
	

	/*
	 * 1742년, 독일의 아마추어 수학가 크리스티안 골드바흐는 레온하르트 오일러에게 다음과 같은 추측을 제안하는 편지를 보냈다.
	 * 
	 * 4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다. 예를 들어 8은 3 + 5로 나타낼 수 있고, 3과 5는 모두 홀수인
	 * 소수이다. 또, 20 = 3 + 17 = 7 + 13, 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23 이다.
	 * 
	 * 이 추측은 아직도 해결되지 않은 문제이다.
	 * 
	 * 백만 이하의 모든 짝수에 대해서, 이 추측을 검증하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
				
			}
		}
		
	}
}
