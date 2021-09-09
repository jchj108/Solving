package level.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2908_SangSu {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> list = new ArrayList<String>();

		int[] arr = new int[st.countTokens()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < arr.length; i++) {
			String s = "";
			for (int j = String.valueOf(arr[i]).length()-1; j >= 0; j--) {
				s += (String.valueOf(arr[i]).charAt(j));
				list.add(s);
			}
		}
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (Integer.parseInt(list.get(i)) > max) {
				max = Integer.parseInt(list.get(i));
			}
		}
		System.out.println(max);
	}
}
