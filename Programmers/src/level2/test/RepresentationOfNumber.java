package level2.test;


public class RepresentationOfNumber {
	
    public int solution(int n) {
        int answer = 1;
        
        for(int i = 1; i < n / 2 + 1; i++) { // ���� ��
        	int sum = i;
        	for(int j = i+1; sum < n; j++) { // ����
        		sum+=j; // ������ ��
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
