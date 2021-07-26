package level1.test;

public class Keypad {

    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int lnum = 10;
        int rnum = 12;
        
        for(int i : numbers) {
        	if(i==0) {
        		i=11;
        	}
        	if(i == 1 || i == 4 || i == 7) {
        		lnum = i;
        		sb.append("L");
        	} else if (i == 3 || i == 6 || i == 9) {
        		rnum = i;
        		sb.append("R");
        	} else {
        		int lCount = (int)Math.abs((lnum - i)/3) + (int)Math.abs((lnum - i) % 3);
        		int rCount = (int)Math.abs((rnum - i)/3) + (int)Math.abs((rnum - i) % 3);
        		if(lCount > rCount) {
        			sb.append("R");
        			rnum = i;
        		} else if (rCount > lCount) {
        			sb.append("L");
        			lnum = i;
        		} else {
        			if(hand.equals("left")) {
        				sb.append("L");
        				lnum = i;
        			} else {
        				sb.append("R");
        				rnum = i;
        			}
        		}
        	}
        }
        
        return sb.toString();
    }
	
	public static void main(String[] args) {
		
		String result = new Keypad().solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
		System.out.println(result);
	}
}
