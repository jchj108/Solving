package level1.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FailureRate {

	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];

		HashMap<Integer, Double> map = new HashMap<Integer, Double>();
		for (int i = 1; i <= N + 1; i++) {
			map.put(i, 0.0);
		}
		Arrays.sort(stages);

		for (int i = 0; i < stages.length; i++) {
			if (stages[i] <= N) {
				map.put(stages[i], map.get(stages[i]) + 1);
			} else {
				map.put(N + 1, map.get(N + 1) + 1);
			}
		}

		HashMap<Integer, Double> map2 = new HashMap<Integer, Double>();

		int tmp = stages.length;
		for (int i = 1; i < map.keySet().size(); i++) {
			if (i != 1) {
				tmp -= map.get(i - 1);
				map2.put(i, map.get(i) / tmp);
			} else {
				map2.put(i, map.get(i) / tmp);
			}
			System.out.println(tmp);
		}
		
		List list2 = new ArrayList(10);

		// 정렬하기 위해 리스트에 담아 value기준 정렬, 값이 같으면 라운드가 작은 숫자가 우선순위
		ArrayList<Integer> keySetList = new ArrayList<Integer>(map.keySet());
		keySetList.remove(N);

		for(int i = 0 ; i < N; i ++) {
			for(int j = 1; j <= N; j++) {
			}
		}
		
		

		return answer;
	}


	public static void main(String[] args) {
		new FailureRate().solution(5, new int[] { 2, 1, 2, 6, 2, 4, 3, 3 });
	}
}
