package level2.test;

public class JadenCase {

	public String solution(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		String firstStr = s.charAt(0) + "";
		sb.append(firstStr.toUpperCase());
		
		for(int i = 1; i < s.length(); i++) {
			String c = s.charAt(i)+""; // char to String
			
			if(c.equals(' ')) {
				sb.append(" ");
			} else if (s.charAt(i - 1) == ' ') {
				sb.append(c.toUpperCase());
			} else {
				sb.append(c.toLowerCase());
			}
			
		}
		
		return sb.toString();

	}
	public static void main(String[] args) {
		String result = new JadenCase().solution("3people   unFollowed     me");
		
	}
}
