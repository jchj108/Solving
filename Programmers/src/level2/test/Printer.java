package level2.test;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		
		int[] priorities = {2, 1, 3, 2}; // 중요도가 높을수록 빨리 인쇄
		int location = 2; // 요청한 문서의 index 

		p.solution(priorities, location);
		
		
	}
    public int solution(int[] priorities, int location) {
    	Queue<Doc> q = new LinkedList<Doc>();
    	
    	for(int i = 0; i < priorities.length; i++) {
    		q.add(new Doc(i, priorities[i]));
    	}

    	int first = q.peek().getPriority();
    	while(!q.isEmpty()) {
    		
    		Doc cur = q.remove();
    		boolean flag = true;
    		
//    		for(int i = 0; i < q.size(); i++) { // 순회하려면 향상된포문써야함
//    			if(cur.getPriority() < q.poll().getPriority()) { // 큐에 남아 있는 노드 중 우선순위가 높은 게 하나라도 있다면
//    				flag = false;
//    				break;
//    			}
//    		}
    		
    		if(!flag) {
    			q.add(cur);
    			System.out.println(q.size());
    		} else {
    			System.out.println(q.size());
    		}
    	}
    	
        int answer = 0;
        return answer;
    }
    
    static class Doc {
    	int index, priority;
    	boolean flag;
    	
		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public int getPriority() {
			return priority;
		}
		
		public boolean isFlag() {
			return flag;
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}

		public void setPriority(int priority) {
			this.priority = priority;
		}
		
		public Doc(int index, int priority) {
			this.index = index;
			this.priority = priority;
		}
    }
}
