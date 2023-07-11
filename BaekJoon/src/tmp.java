import java.util.*;
import java.util.stream.Collectors;

public class tmp {
	public static void main(String[] args) {

		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};

		solution(players, callings);
	}
	public static String[] solution(String[] players, String[] callings) {

		ArrayList<String> playerList = new ArrayList<>(Arrays.asList(players));

		for (String calling : callings) {

			int idx = playerList.indexOf(calling);
			int idx2 = idx - 1 ;
			String swap = playerList.get(idx);
			String swap2 = playerList.get(idx2);

			playerList.set(idx, swap2);
			playerList.set(idx2, swap);

		}

		// System.out.println(playerList);

		return playerList.toArray(new String[0]);

	}
}

	