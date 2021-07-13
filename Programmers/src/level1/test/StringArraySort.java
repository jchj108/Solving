package level1.test;

import java.util.ArrayList;
import java.util.Collections;

public class StringArraySort {

	public String[] solution(String[] strings, int n) {
		
		String[] answer = strings.clone();

		for(int i = 0; i < answer.length; i++) {
			answer[i] = answer[i].charAt(n) + answer[i];
		}
		
		ArrayList<String> list = new ArrayList<>();
		for(String s : answer) {
			list.add(s);
		}
		Collections.sort(list);
		
		String[] tmp = new String[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			tmp[i] = list.get(i).substring(1);
		}
		
		
		return tmp;
	}
	
	
	
	public static void main(String[] args) {
		StringArraySort sas = new StringArraySort();
		
		String[] strings = {"sun", "bed", "car"};
		String[] answer = {};
		
		answer = sas.solution(strings, 1);
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
}
