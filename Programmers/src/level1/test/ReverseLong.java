package level1.test;


public class ReverseLong {
	
    public int[] solution(long n) {
        
        char[] cArr = Long.toString(n).toCharArray();
        int[] answer = new int[cArr.length];
        
        int index = cArr.length;
        for(int i = 0; i<cArr.length; i++) {
        	answer[--index] = cArr[i] - '0';
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		
		ReverseLong rl = new ReverseLong();

		int[] result = rl.solution(882727126426L);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
		
	}
}
