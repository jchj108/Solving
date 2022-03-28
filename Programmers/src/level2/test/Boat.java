package level2.test;

import java.util.Arrays;

public class Boat {

	public static void main(String[] args) {

		Boat b = new Boat();
		int[] arr = {70, 50, 90};

		System.out.println(b.solution(arr, 100));
	}

	public int solution(int[] people, int limit) {
		Arrays.sort(people);
	    int answer = 0;
	    
	    int j = 0;
	    
	    
	    for(int i = people.length-1; i >= j; i--) {
	    	if(people[i] + people[j] <= limit) {
	    		j++;
	    		answer++;
	    	} else {
	    		answer++;
	    	}
	    }
	    
	    
	    return answer;
	}
}