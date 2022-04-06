package level2.test;

import java.util.HashSet;
import java.util.Set;

public class FindPrimeNumber {

	static boolean[] visited = new boolean[10];
	static int count;
	static Set<Integer> set = new HashSet<Integer>();
	public static void main(String[] args) {

		int result = solution("17");
		System.out.println(result);
	}

	public static int solution(String numbers) {
		String tmp = "";
		for (int i = 0; i < numbers.length(); i++) {
			dfs(numbers, tmp, i + 1); // dfs depth 를 증가, depth가 1일 때는 1개만 뽑고 2일 때는 2개를 뽑는다.
		}

		return count;
	}

	private static void dfs(String numbers, String tmp, int m) {
		

		if (tmp.length() == m) {
			if(set.contains(Integer.parseInt(tmp))) {
				return;
			}
			set.add(Integer.parseInt(tmp));
			if (isPrime(tmp)) {
				count++;
			}
			return;
		}

		for (int i = 0; i < numbers.length(); i++) {
			if (!visited[i]) {
				visited[i] = true;
				tmp += numbers.charAt(i);
				dfs(numbers, tmp, m);
				visited[i] = false;
				tmp = tmp.substring(0, tmp.length() - 1); // 마지막에 고른 숫자 제거
			}
		}
	}

	private static boolean isPrime(String tmp) {
		
		int num = Integer.parseInt(tmp);
		
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
