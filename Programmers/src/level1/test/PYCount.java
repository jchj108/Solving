package level1.test;

public class PYCount {

	boolean solution(String s) {
		boolean answer = false;
		int p = 0;
		int y = 0;
		
		char[] arr = s.toUpperCase().toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 'P') {
				p++;
			} 
			else if(arr[i] == 'Y') {
				y++;
			}
		}
		
		return p == y;
		
	}
	
	
	public static void main(String[] args) {
		
		PYCount pyc = new PYCount();
		
		System.out.println(pyc.solution("pPoooyY")); 
		

	}

}
