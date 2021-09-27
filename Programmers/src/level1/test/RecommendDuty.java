package level1.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class RecommendDuty {

	public String solution(String[] table, String[] languages, int[] preference) {
		String answer = "";

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < languages.length; i++) {
			map.put(languages[i], preference[i]);
		}
		List<String> list = new ArrayList<String>();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < table.length; i++) {
			StringTokenizer st = new StringTokenizer(table[i]);
			int sum = 0;
			String s = st.nextToken();
			int point = 5;
			while (st.hasMoreTokens()) {
				String language = st.nextToken();
				if (map.containsKey(language)) {
					sum += map.get(language) * point;
				}
				point--;
			}
			if(max < sum) {
				max = sum;
				answer = s;
				list.clear();
				list.add(s);
			} else if (max == sum) {
				list.add(s);
			}
		}
		if(list.size() > 1) {
			Collections.sort(list);
			answer = list.get(0);
		}
		return answer;
	}

	public static void main(String[] args) {

		String[] table = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
		String[] languages = { "PYTHON", "C++", "SQL" };
		int[] preferences = { 7, 5, 5 };
		RecommendDuty rd = new RecommendDuty();
		System.out.println(rd.solution(table, languages, preferences));
	}
}
