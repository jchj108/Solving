package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C {
	
	public static void main(String[] args) {
		
		List a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(10);
		a.add(7);
		int result = maxLength(a, 11);
		System.out.println(result);
	}
	

    public static int maxLength(List<Integer> a, int k) {
        Collections.sort(a);
        int j = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
        	sum += a.get(i);
        	if(sum > k) {
        		break;
        	}
        	j++;
        }
        
        return j;
    }

}
