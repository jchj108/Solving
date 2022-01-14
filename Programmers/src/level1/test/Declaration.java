package level1.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Declaration {

	public static void main(String[] args) {

		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;

		int[] result = solution(id_list, report, k);

		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int[] solution(String[] id_list, String[] report, int k) {
		HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
		for (int i = 0; i < report.length; i++) {
			StringTokenizer st = new StringTokenizer(report[i]);
			String delator = st.nextToken(); // 신고자 id
			String suspect = st.nextToken(); // 신고된 사람 id
			HashSet<String> set = new HashSet<String>();

			set.add(delator);
			if (!map.containsKey(suspect)) {
				map.put(suspect, set);
			} else {
				Iterator<String> iter = map.get(suspect).iterator();
				while(iter.hasNext()) {
					set.add(iter.next());
				}
				map.put(suspect, set);
			}
		}

		// HashMap : key = 신고된 사람, value(set) = 신고자 set
		int[] result = new int[id_list.length];

		for (int i = 0; i < id_list.length; i++) {
			int cnt = 0;
			for(String s : id_list) {
				if(s.equals(id_list[i])) {
					continue;
				}
				if(map.containsKey(s)) {
					if(map.get(s).size() >= k && map.get(s).contains(id_list[i])) { 
						cnt++;
					}
				}
			}
			result[i] = cnt;
		}
		return result;
	}
}
