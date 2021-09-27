package level1.test;

public class BusinessCard {
	
	public int solution(int[][] sizes) {
		int answer = 0;
		
		int MaxWidth = sizes[0][0];
		int MaxHeight = sizes[0][1];
		
		for(int i = 1; i < sizes.length; i++) {
			if(sizes[i][0] > MaxWidth) {
				MaxWidth = sizes[i][0];
			}
		}
		for(int i = 1; i < sizes.length; i++) {
			if(sizes[i][1] > MaxHeight && sizes[i][1] > MaxWidth) {
				MaxHeight = sizes[i][1];
			}
		}
		System.out.println("MaxWidth : " + MaxWidth);
		System.out.println("MaxHeight : " + MaxHeight);
		
		return MaxWidth * MaxHeight;
	}

	public static void main(String[] args) {
		BusinessCard bc = new BusinessCard();
		System.out.println(bc.solution(new int[][] {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
	}
}
