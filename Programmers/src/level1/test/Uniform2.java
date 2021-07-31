package level1.test;

public class Uniform2 {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		int[] suit = new int[n];

		for (int i = 0; i < lost.length; i++) {
			suit[lost[i] - 1] -= 1;
		}

		for (int i = 0; i < reserve.length; i++) {
			suit[reserve[i] - 1] += 1;
		}
		
		for(int i : suit) {
			System.out.println(i);
		}
		
		answer = n - lost.length;

		for(int i = 0; i < suit.length; i++) {
			if(suit[i] < 0) {
				if(i != suit.length -1 && suit[i+1] > 0 ) {
					answer++;
					System.out.println("Áõ°¡");
					suit[i+1] -= 1;
					suit[i] += 1;
				} 
			}
		}

		System.out.println("----------------");
		
		for(int i : suit) {
			System.out.println(i);
		}
		
		for(int i = suit.length-1; i > 0; i--) {
			if(suit[i] < 0) {
				if(suit[i-1] > 0) {
					answer++;
				}
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		int result = new Uniform2().solution(3, new int[] {3}, new int[] {1});
		System.out.println("result : " + result);
	}

}
