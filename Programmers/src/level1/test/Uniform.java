package level1.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Uniform {

    public int solution(int n, int[] lost, int[] reserve) {
    	
    	/*
    	 * -1 : 도난
    	 * 0 : 기본
    	 * 1 : 여벌
    	 */ 
    	
    	int[] all = new int[n];
    	
    	for(int i : reserve) {
    		all[i - 1]++;
    	}
    	for(int i : lost) {
    		all[i - 1]--;
    	}
    	
    	for(int i = 0; i <all.length; i++) {
    		if(all[i] < 0) {
    			if(i != all.length -1 && all[i+1] > 0) {
    				all[i]++;
    				all[i+1]--;
    			} else if (i != 0 && all[i-1] > 0) {
    				System.out.println("예외?");
    				all[i]++;
    			}
    		}
    	}
    	
    	int answer = 0;
    	
    	for(int i =0; i < all.length; i++) {
    		if(all[i] >= 0) {
    			answer++;
    		}
    	}
    	return answer;
    }
	
	public static void main(String[] args) {
		
		int result = new Uniform().solution(5, new int[] {2, 4}, new int[] {1});
		System.out.println("result : " +result);
	}
}
