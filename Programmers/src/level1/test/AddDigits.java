package level1.test;

public class AddDigits {

	public int solution(int n) {
		int answer = 0;

		char[] cArr = Integer.toString(n).toCharArray();
		
		for(int i = 0; i < cArr.length; i++) {
			answer += cArr[i] - '0';
		}
		
		return answer;
	}

	public static void main(String[] args) {
		AddDigits ad = new AddDigits();

		System.out.println(ad.solution(42222));
	}

}
