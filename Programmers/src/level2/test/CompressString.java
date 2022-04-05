package level2.test;

import java.util.HashSet;
import java.util.Set;

public class CompressString {

	public static void main(String[] args) {
		
		String s = "ababcdcdababcdcd";
		
		int result = solution("abcd");
		
		
		
		
	}

	
    public static int solution(String s) {
    	
    	int answer = s.length();
    	
    	for(int i = 1; i <= s.length()/2; i++) {
    		int zip = 1;
    		String zipStr = s.substring(0, i);
    		
    		for(int j = i; j <= s.length(); j+= i) {
    			String next = s.substring(j, j+i > s.length() ? s.length() : i + j);
    			
    		}
    		
    		
    	}
    	
    	
    	
    	
        
        return answer;
    }
}
