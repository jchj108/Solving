package level1.test;

public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {
    	
        String[] binary = new String[n];
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
        	binary[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        	for(int j = 0; j < n; j++) {
	        	if(binary[i].length() < n) {
	        		binary[i] = "0" + binary[i];
	        	}
        	}
        }
        
        for(int i = 0; i < n; i++) {
        	StringBuilder sb = new StringBuilder();
        	for(int j = 0; j < n; j++) {
        		if(binary[i].charAt(j) == '1') {
        			sb.append("#");
        		} else {
        			sb.append(" ");
        		}
        	}
        	answer[i] = sb.toString();
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String answer[] = {};
		
		answer = new SecretMap().solution(5, new int[] {0, 0, 0, 0, 0}, new int[] {30, 1, 21, 17, 28});
		
//		for(String s : binary) {
//			System.out.println(binary);
//		}
		
	}

}
