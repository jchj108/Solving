package level1.test;

import java.util.Arrays;

public class Marathon2 {
	
    public String solution(String[] participant, String[] completion) {
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	int i;

    	for(i = 0; i < completion.length; i++) {
    		if(!participant[i].equals(completion[i])) {
    			return participant[i];
    		}
    	}
    	
    	System.out.println(i);
    	return participant[i];
    }

	public static void main(String[] args) {
		
		String answer = new Marathon2().solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"});
		
		System.out.println(answer);
	}

}
