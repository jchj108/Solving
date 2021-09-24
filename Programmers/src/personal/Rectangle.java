package personal;

public class Rectangle {
	
	public int[] solution(int[][] v) {
		
		int[] coord1 = v[0];
		int[] coord2 = v[1];
		int[] coord3 = v[2];
		
		int x;
		int y;
		
		if(coord1[0] == coord2[0]) {
			x = coord3[0];
		} else if(coord2[0] == coord3[0]) {
			x = coord1[0];
		} else {
			x = coord2[0];
		}
		
		if(coord1[1] == coord2[1]) {
			y = coord3[1];
		} else if(coord2[1] == coord3[1]) {
			y = coord1[1];
		} else {
			y = coord2[1];
		}
		
		int[] answer = {x, y};
		
		return answer;
	}
	

	public static void main(String[] args) {
		
		int[][] v = {
				{1, 1},
				{2, 2},
				{1, 2}
		};
		
		int[] result = new Rectangle().solution(v);
		
		for(int i : result) {
			System.out.println(i);
		}
	}
}
