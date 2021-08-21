import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MaxAndMin {

	public String solution(String s) {

		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(s, " ");
		int max = -9999999;
		int min = 9999999;

		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		for (int i : list) {
			if (max < i) max = i;
			if (min > i) min = i;
		}
		sb.append(min);
		sb.append(" ");
		sb.append(max);

		return sb.toString();
	}

	public static void main(String[] args) {
		String result = new MaxAndMin().solution("1 2 3 4");
		System.out.println(result);
	}
}
