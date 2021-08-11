package level2.test;

public class RepresentationOfNumber {
	
    public int solution(int n) {
        int answer = 0;
        
        
        
        for(int i = 1; i < n; i++) {
        	for(int j = 1; j < n; j++) {
        		if(i + j == n) {
        			answer++;
        		}
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int result = new RepresentationOfNumber().solution(15);
		System.out.println(result);
	}
}
