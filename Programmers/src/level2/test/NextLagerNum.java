package level2.test;

public class NextLagerNum {

	public static void main(String[] args) {
		System.out.println(solution(78));
		
	}
	
	
    public static int solution(int n) {
    	
    	String s = Integer.toBinaryString(n);
    	
    	int sum = 0; // n의 1의 개수
    	
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) == '1') {
    			sum++; 
    		}
    	}
    	
    	while(true) {
    		int n2 = ++n;
    		if(getiBinary(sum, n2)) {
    			return n2;
    		}
    	}
    }


	private static boolean getiBinary(int sum, int n2) {
		
		String binaryS = Integer.toBinaryString(n2);
		
		int sum2 = 0;
		for(int i = 0; i < binaryS.length(); i++) {
			if(binaryS.charAt(i) == '1') {
				sum2++;
			}
		}
		if(sum2 == sum) {
			return true;
		}
		return false;
	}
}
