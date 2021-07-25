package level1.test;

import java.util.HashSet;
import java.util.Set;

public class PonketMon {

    public int solution(int[] nums) {
	   	
    	Set<Integer> set = new HashSet<Integer>();
    	
    	for(int i : nums) {
    		set.add(i);
    	}
    	
    	if (set.size() >= nums.length / 2) {
    		return nums.length / 2;
    	} 
        
        return set.size();
    }
    
	
	public static void main(String[] args) {
		int result = new PonketMon().solution(new int[] {3,3,3,2,2,2});
		System.out.println(result);
	}
}
