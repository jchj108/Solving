package level1.test;

public class StrangeString {

	public String solution(String s) {

		int index = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				sb.append(' ');
				index = 0;
			} else {
				if (index % 2 == 0) { // index 단어의 처음부터 짝수체크
					sb.append(Character.toUpperCase(s.charAt(i)));
					index ++;
				} else {
					sb.append(Character.toLowerCase(s.charAt(i)));
					index ++;
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		StrangeString ss = new StrangeString();
		
		System.out.println(ss.solution("try hello world"));
	}

}
