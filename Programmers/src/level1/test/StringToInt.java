package level1.test;

public class StringToInt {

	public int solution(String s) {
		int answer = 0;
		String tmp = "";
		

		if(s.charAt(0) == '+' || s.charAt(0) == '-') {

			if (s.charAt(0) == '+') {
				for(int i = 1; i < s.length(); i++ ) {
					tmp += s.charAt(i);
				}
				return Integer.parseInt(tmp);
			}
			else if (s.charAt(0) == '-') {
				for(int i = 1; i < s.length(); i++ ) {
					tmp += s.charAt(i);
				}
				return Integer.parseInt(tmp) * -1;
			}
		} else {
			return Integer.parseInt(s);
		}

		return answer;
	}

	public static void main(String[] args) {
		StringToInt sti = new StringToInt();
		System.out.println(sti.solution("-1"));
	}
}
