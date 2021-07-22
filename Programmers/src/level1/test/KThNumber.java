package level1.test;

import java.util.Arrays;
import java.util.Collections;

public class KThNumber {

	public int[] solution(int[] array, int[][] commands) {

		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
			int[] tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(tmp);

			answer[i] = tmp[commands[i][2]-1];
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {

		int commands[][] = {
								{2, 5, 3},
								{4, 4, 1},
								{1, 7, 3}
							};
		
		int answer[] =  new KThNumber().solution(new int[] {1, 5, 2, 6, 3, 7, 4}, commands);
		System.out.print("answer : ");
		for(int i : answer) {
			System.out.print(i);
		}
		
	}
}
