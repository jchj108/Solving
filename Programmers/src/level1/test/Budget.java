package level1.test;

import java.util.Arrays;

public class Budget {

	public int solution(int[] d, int budget) {
		int answer = 0;
		// ���� ������ �����ؾ��Ѵ�.
		Arrays.sort(d);
		
		for(int i = 0; i < d.length; i++) {
			if(d[i] <= budget) {
				budget -= d[i];
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		int result = 0;
		result = new Budget().solution(new int[] { 1, 3, 2, 5, 4 }, 9);
		System.out.println(result);
	}
}
