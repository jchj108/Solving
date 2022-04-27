package level2.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class OpenChat {

	public static void main(String[] args) {

		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };

	}

	public String[] solution(String[] record) {
		String[] answer = {};
		ArrayList<String[]> list = new ArrayList<>();
		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < record.length; i++) {
			StringTokenizer st = new StringTokenizer(record[i]);

			String temp = st.nextToken();
			String id = st.nextToken();

			if (temp.equals("Enter")) {
				String nick = st.nextToken();
				String[] t = { id, "Enter" };
				list.add(t);
				map.put(id, nick);

			} else if (temp.equals("Leave")) {
				String[] t = { id, "Leave" };
				list.add(t);

			} else if (temp.equals("Change")) {
				String nick = st.nextToken();
				map.put(id, nick);
			}
		}

		answer = new String[list.size()];
		int i = 0;
		for (String[] s : list) {
			if (s[1].equals("Enter")) {
				answer[i] = map.get(s[0]) + "님이 들어왔습니다.";
			} else if (s[1].equals("Leave")) {
				answer[i] = map.get(s[0]) + "님이 나갔습니다.";
			}
			i++;
		}

		return answer;
	}

}
