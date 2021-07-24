package level1.test;

public class YearOf2016 {
	
    public String solution(int a, int b) {
    	String answer = "";
    	String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

    	int offset = 0;
    	for(int i = 1; i < a; i++) {
    		switch(i) {
    		case 2 :
    			offset += 29; break;
    		case 4 :
    		case 6 :
    		case 9 :
    		case 11 :
    			offset += 30; break;
    		default :
    			offset += 31; break;
    		}
    	}
    	
    	String s = "ÇÏ³ª";
    	int[] arr = {1, 2, 3};
    	
    	int ss = s.length();
    	
		answer = days[((offset+b-1)) % days.length];
    
		
		
        return answer;
    }
    
    
    public static void main(String[] args) {
    	
    	String answer = new YearOf2016().solution(3, 5);
    	System.out.println(answer);
    	
	}
}
