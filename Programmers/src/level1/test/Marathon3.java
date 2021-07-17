package level1.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class Marathon3 {

    public String solution(String[] participant, String[] completion) {
    	String answer = "";
    	
    	Map<String, Integer> map = new HashMap();
    	
    	for(String p : participant) {
    		if(map.get(p) == null) {
    			map.put(p, 1);
    		} else { // �������� ó��
    			map.put(p, map.get(p) + 1); // map.get(p)�� ��������� ������ ��ȿ�ϹǷ� ���������� �����ϴ�.
    		}
    	}
    	
    	for(String c : completion) {
    			map.put(c, map.get(c) - 1);
    	}
    	
    	for(String s : map.keySet()) { // keySet�� �̿��ϸ� �ݺ����� ���� �� �ִ�
    		if(map.get(s) != 0) {
    			answer+=s;
    		}
    	}
    	
//    	Iterator<Entry<String, Integer>> entries = map.entrySet().iterator();
//    	while(entries.hasNext()) {
//    		Map.Entry<String, Integer> entry = entries.next();
//    		System.out.println("[key]:" + entry.getKey() + "[value]:" + entry.getValue());
//    	}
    	
    	return answer;
    }
	
	
	
	public static void main(String[] args) {
		String answer = new Marathon3().solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"});
		System.out.println(answer);
	}
}
