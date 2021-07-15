package level1.test;

import java.util.ArrayList;
import java.util.Arrays;

public class AddCase {
	
    public int[] solution(int[] numbers) {
        
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	// 서로 다른 수여야 한다.
    	for(int i = 0; i < numbers.length; i++) {
    		for(int j = 0; j < numbers.length; j++) {
    			if(j==i) {
    				break;
    			}
    			if(!list.contains(numbers[i]+numbers[j])) {
    				list.add(numbers[i]+numbers[j]);
    			}
    		}
    	}
    	
    	int[] answer = new int[list.size()];
        
    	for(int i = 0; i < list.size(); i++) {
    		answer[i] = list.get(i).intValue();
    	}
    	
    	Arrays.sort(answer);
    	
        return answer; 
    }
	
	
	public static void main(String[] args) {
		int[] answer = {};
		answer = new AddCase().solution(new int[]{5,0,2,7});
		
		for(int i : answer) {
			System.out.println(i);
		}
		
	}
}
