package level1.test;

public class TakeCenter {
	
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 != 0) {
            int i = s.length() / 2;
            answer += s.charAt(i);
        } else {
            int i = s.length() / 2;
            answer += s.charAt(i-1);
            answer += s.charAt(i);
        }
        return answer;
    }
	
	
	
	

	public static void main(String[] args) {
		
		String answer = new TakeCenter().solution("abcde");
		System.out.println(answer);

	}

}
