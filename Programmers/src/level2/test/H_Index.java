package level2.test;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		
		int[] citations = {1, 3, 3};
		
		H_Index h = new H_Index();
		
		int result = h.solution(citations);
		System.out.println(result);
		
		
	}
	public int solution(int[] citations) {
		
		Arrays.sort(citations);
		int answer = 0;
		
		for(int i = 0; i < citations.length; i++) {
			int h = citations.length-i; // count
			
			if(citations[i] >=h) {
				answer = h;
				break;
			}
		}
		return answer;
	}
}
