package level1.test;

public class Maratohn1 {

    public String solution(String[] participant, String[] completion) {
    	String answer = "";
    	boolean flag = false;
    	
    	for(int i = 0; i < participant.length; i++) {
    		flag = true;
    		for(int j = 0; j < completion.length; j++) {
    			if(participant[i].equals(completion[j])) {
    				completion[j] = null;
    				flag = false;
    				break;
    			}
    		}
    		if(flag) {
    			answer += participant[i];
    		}
    	}
    	
    	return answer;
    }
	
	public static void main(String[] args) {
		
		String answer = new Maratohn1().solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"});
		
		System.out.println(answer);
		
	}
	
}
