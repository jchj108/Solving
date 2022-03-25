package level2.test;

import java.util.ArrayList;

public class DevelopeFunction {
	public static void main(String[] args) {
	
		DevelopeFunction dev = new DevelopeFunction();
		
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds	 = {1, 1, 1, 1, 1, 1};
		
		int[] result = dev.solution(progresses, speeds);
		
		for(int i : result) {
			System.out.println(i);
		}
		
		
	}
	
    public int[] solution(int[] progresses, int[] speeds) {
    	
    	int[] time= new int[progresses.length]; // 각 작업이 종료될 때까지 걸리는 시간
    	
    	for(int i = 0; i < progresses.length; i++) {
    		int progress = progresses[i];
    		int count = 0;
    		
    		while(true) {
    			progress += speeds[i];
    			count++;
    			if(progress >= 100) {
    				break;
    			}
    		}
    		time[i] = count;
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	int count = 1;
    	int prev = time[0];
    	
    	for(int i = 1; i < time.length; i++) {
    		if(prev < time[i] ) {
    			list.add(count);
    			count = 1;
    			prev = time[i];
    		} else {
    			count++;
    		}
    	}
    	list.add(count);
    	
    	
    	int[] answer = new int[list.size()];
    	for(int i = 0; i < list.size(); i++) {
    		answer[i] = list.get(i);
    	}
    	
        return answer;
    }

}
