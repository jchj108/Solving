package level1.test;

import java.util.ArrayList;
import java.util.Arrays;

public class AddCase {
	
    public int[] solution(int[] numbers) {
        
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	// ���� �ٸ� ������ �Ѵ�.
    	for(int i = 0; i < numbers.length; i++) {
    		for(int j = i+1; j < numbers.length; j++) {
//    			if(j==i) {
//    				break;
//    			} j = i+1�� �����ϸ� ���� ������ �ڵ�, ���� �ʰ� ������ �߻������� �ʴ´�.
    			System.out.println("ddd : " + numbers[j]);
    			
    			
    			if(!list.contains(numbers[i]+numbers[j])) {
    				list.add(numbers[i]+numbers[j]);
    			}
    		}
    	}
    	
    	int[] binary = new int[list.size()];
        
    	for(int i = 0; i < list.size(); i++) {
    		binary[i] = list.get(i).intValue();
    	}
    	
    	Arrays.sort(binary);
    	
        return binary; 
    }
	
	
	public static void main(String[] args) {
		int[] answer = {};
		answer = new AddCase().solution(new int[]{5,0});
		
		for(int i : answer) {
			System.out.println(i);
		}
		
	}
}
