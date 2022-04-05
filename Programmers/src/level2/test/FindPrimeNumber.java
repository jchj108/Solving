package level2.test;

import java.util.Arrays;

public class FindPrimeNumber {

	static boolean[] visited = new boolean[10];

	public static void main(String[] args) {

		int result = solution("123");

	}

	public static int solution(String numbers) {
		int answer = 0;
		
		String tmp = "";
		for(int i = 0; i < numbers.length(); i++) {
			dfs(numbers, tmp, i+1);
		}
		
		

		return answer;
	}

	private static void dfs(String numbers, String tmp, int m) {
		
		if(tmp.length() == m) { 
			System.out.println(tmp);
			
			return;
		}
		
		for(int i = 0; i < numbers.length(); i++) {
			if(!visited[i]) {
				visited[i] = true;
				tmp += numbers.charAt(i);
				dfs(numbers, tmp, m);
				visited[i] = false;
				tmp = tmp.substring(0, tmp.length()-1);
			}
		}
	}

}
