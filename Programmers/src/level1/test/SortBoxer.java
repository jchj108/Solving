package level1.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Player {
	int no;
	int weight;
	double winRate;
	int overCount;

	public Player(int no, int weight, double winRate, int overCount) {
		this.no = no;
		this.weight = weight;
		this.winRate = winRate;
		this.overCount = overCount;
	}
}

public class SortBoxer {

	public int[] solution(int[] weights, String[] head2head) {
		int[] answer = new int[weights.length];
		List<Player> records = new ArrayList<Player>();

		for (int i = 0; i < head2head.length; i++) {
			double winCount = 0.0;
			double totalCount = 0.0;
			int overCount = 0;
			char[] recordArray = head2head[i].toCharArray();

			for (int j = 0; j < recordArray.length; j++) {
				if (recordArray[j] != 'N') {
					totalCount++; // 경기 수
					if (recordArray[j] == 'W') {
						winCount++; // 승리 수
						if (weights[i] < weights[j]) { // 체급 차 승리 수
							overCount++;
						}
					}
				}
			}
			double winRate = winCount / totalCount; // 승률
			Player player = new Player(i + 1, weights[i], winRate, overCount);
			records.add(player);
		}
		// 3. 요구사항대로 정렬하기
		Collections.sort(records, new Comparator<Player>() {
			@Override
			public int compare(Player p1, Player p2) {
				// 승률 내림차순
				if (p1.winRate > p2.winRate)
					return -1;
				else if (p1.winRate < p2.winRate)
					return 1;
				else { // 승률 같다면, 체급 차 승리 수 내림차순
					if (p1.overCount > p2.overCount)
						return -1;
					else if (p1.overCount < p2.overCount)
						return 1;
					else { // 같다면, 몸무게 내림차순
						if (p1.weight > p2.weight)
							return -1;
						else if (p1.weight < p2.weight)
							return 1;
						else { // 같다면, 번호(이름) 오름차순
							if (p1.no > p2.no)
								return 1;
							else if (p1.no < p2.no)
								return -1;
						}
					}
				}
				return 0;
			}
		});
		// 4. return 배열 만들기(player의 번호)
		for (int i = 0; i < records.size(); i++) {
			Player player = records.get(i);
			answer[i] = player.no;
		}
		return answer;
	}
	public static void main(String[] args) {

	}
}
