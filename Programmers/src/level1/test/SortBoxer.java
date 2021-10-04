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
					totalCount++; // ��� ��
					if (recordArray[j] == 'W') {
						winCount++; // �¸� ��
						if (weights[i] < weights[j]) { // ü�� �� �¸� ��
							overCount++;
						}
					}
				}
			}
			double winRate = winCount / totalCount; // �·�
			Player player = new Player(i + 1, weights[i], winRate, overCount);
			records.add(player);
		}
		// 3. �䱸���״�� �����ϱ�
		Collections.sort(records, new Comparator<Player>() {
			@Override
			public int compare(Player p1, Player p2) {
				// �·� ��������
				if (p1.winRate > p2.winRate)
					return -1;
				else if (p1.winRate < p2.winRate)
					return 1;
				else { // �·� ���ٸ�, ü�� �� �¸� �� ��������
					if (p1.overCount > p2.overCount)
						return -1;
					else if (p1.overCount < p2.overCount)
						return 1;
					else { // ���ٸ�, ������ ��������
						if (p1.weight > p2.weight)
							return -1;
						else if (p1.weight < p2.weight)
							return 1;
						else { // ���ٸ�, ��ȣ(�̸�) ��������
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
		// 4. return �迭 �����(player�� ��ȣ)
		for (int i = 0; i < records.size(); i++) {
			Player player = records.get(i);
			answer[i] = player.no;
		}
		return answer;
	}
	public static void main(String[] args) {

	}
}
