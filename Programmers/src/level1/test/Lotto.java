package level1.test;

public class Lotto {
	
	public int[] solution(int[] lottos, int[] win_nums) {
		
		int max = 0;
		int min = 0;
		int maxRank = 7;
		int minRank = 7;
		
		for(int i = 0; i < lottos.length; i++) {
			boolean hit = false;
			if(lottos[i] == 0) {
				max++;
				maxRank--;
			} else {
				for(int j = 0; j < win_nums.length; j++) {
					if(lottos[i] == win_nums[j]) {
						win_nums[j] = -1;
						hit = true;
						break;
					}
				}
				if(hit) {
					min++;
					minRank--;
					max++;
					maxRank--;
				}
			}
		}
		if(maxRank == 7) {
			maxRank--;
		}
		if(minRank == 7) {
			minRank--;
		}
		
		int[] answer = {maxRank, minRank};
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] result = {};
		
		result = new Lotto().solution(new int[] {0, 0, 0, 0, 0, 0}, new int[] {38, 19, 20, 40, 15, 25});
		
		for(int i : result) {
			System.out.println(i);
		}
	}
}
