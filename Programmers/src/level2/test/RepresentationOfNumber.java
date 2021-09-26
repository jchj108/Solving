package level2.test;


public class RepresentationOfNumber {
	
    public int solution(int n) {
        int answer = 1;
        
        for(int i = 1; i < n / 2 + 1; i++) { // 시작 수
        	int sum = i;
        	for(int j = i+1; sum < n; j++) { // 수열
        		sum+=j; // 수열의 합
        		if(sum == n) {
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
