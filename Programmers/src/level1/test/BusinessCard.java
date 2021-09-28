package level1.test;

public class BusinessCard {
	
	public int solution(int[][] sizes) {
		int answer = 0;
		int mostBig = 0;
		int mostSmall = 0;
		
		for(int i = 0; i < sizes.length; i++) {
			int big = sizes[i][0];
			int small = sizes[i][1];
			
			if(big < small) {
				int temp = big;
				big = small;
				small = temp;
			}
			if(big > mostBig) {
				mostBig = big; // 큰 것 중에서 가장 큰 경우
			}
			if(small > mostSmall) {
				mostSmall = small;
			}
		}
		
		return mostSmall * mostBig;
	}

	public static void main(String[] args) {
		BusinessCard bc = new BusinessCard();
		System.out.println(bc.solution(new int[][] {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
	}
}
