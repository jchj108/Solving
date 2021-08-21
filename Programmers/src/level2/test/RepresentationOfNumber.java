package level2.test;

public class RepresentationOfNumber {
	
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	int sum = 0;
        	for(int j = i; j <= n; j++) {
        		sum += j;
        		
        		if(sum == 15) {
        			answer++;
        			break;
        		} else if(sum > n) {
        			break;
        		}
        	}
        }
        // test
        return answer;
    }

	public static void main(String[] args) {
		int result = new RepresentationOfNumber().solution(15);
		System.out.println(result);
	}
}
