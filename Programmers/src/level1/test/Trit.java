package level1.test;

public class Trit {

    public int solution(int n) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = n; i > 0; i/=3) {
        	if(i % 3 == 0) {
        		sb.append("0");
        	} else if(i % 3 == 1) {
        		sb.append("1");
        	} else {
        		sb.append("2");
        	}
        }
        
        int count = 0;
        for(int i = sb.length(); i > 0; i--) {
        	int index = sb.charAt(i-1)-'0';
        	if(index != 0) {
        		answer += (int)Math.pow(3, count) * index;
        		count++;
        	} else {
        		count++;
        	}
        	System.out.println(answer);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		
		
		new Trit().solution(125);
	}
}
