package level1.test;

public class YearOf2016 {
	
    public String solution(int a, int b) {
    	String answer = "";
    	String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

//    	b에 -1을 해주어야 한다. 
    	
    	/*
			1,3,5,7,8,10,12월 : 31일
			2월 : 29일
			4, 6, 9, 11월 : 30일
    	 */
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
    		System.out.println("i : " + i);
    	}
    	System.out.println("offset : " + offset);
    	System.out.println(offset + b);
    	
    	if(a == 1) {
    		answer = days[(b-1) % days.length];
    	} else {
    		System.out.println(offset);
    		answer = days[((offset+b-1)) % days.length];
    	}
        
        return answer;
    }
    
    
    public static void main(String[] args) {
    	
    	String answer = new YearOf2016().solution(2, 1);
    	System.out.println(answer);
    	
	}
}
