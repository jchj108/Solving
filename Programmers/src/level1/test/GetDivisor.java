package level1.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GetDivisor {

    public int[] solution(int[] arr, int divisor) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i : arr) {
        	if(i % divisor == 0) {
        		list.add(i);
        	}
        }
        
        int[] answer = new int[list.size()];
        
        if(list.isEmpty()) {
        	return new int[] {-1};
        } else {
        	Collections.sort(list);
        	
        	for(int i = 0; i < list.size(); i++) {
        		answer[i] = list.get(i);
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,6};
		
		int[] answer;
		answer = new GetDivisor().solution(arr, 5);
		
		for(int i : answer) {
			System.out.println(i);
		}
	}
}
