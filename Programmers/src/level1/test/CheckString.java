package level1.test;

public class CheckString {

	public boolean solution(String s) {
		boolean answer = true;
		
		if(!(s.length() == 4 || s.length() == 6)) {
			return false;
		}
		
		
		for (int i = 0; i < s.length(); i++) {
			if(!('0' <= s.charAt(i)  && s.charAt(i) <= '9')) {
				answer = false;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		CheckString cs = new CheckString();
		System.out.println(cs.solution("a1234"));
		System.out.println(cs.solution("1234"));

	}

}
