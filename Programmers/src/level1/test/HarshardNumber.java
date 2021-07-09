package level1.test;

public class HarshardNumber {

	public boolean solution(int x) {
		boolean answer = false;
		int ix = 0;

		if (x < 10) {
			answer = true;
		} else {
			String sx = Integer.toString(x);
			for (int i = 0; i < sx.length(); i++) {
				ix += sx.charAt(i) - '0';
			}
			if(x % ix == 0) {
				answer = true;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		HarshardNumber hn = new HarshardNumber();

		System.out.println(hn.solution(10));
		System.out.println(hn.solution(12));
		System.out.println(hn.solution(11));
		System.out.println(hn.solution(13));
	}

}
