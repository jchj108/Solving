package level.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		int count = 0;
		int N = Integer.parseInt(bf.readLine());

		for (int i = 0; i < N; i++) {
			boolean flag = true;
			s = bf.readLine();
			char[] cArr = new char[s.length()];
			for (int j = 0; j < s.length(); j++) {
				if(j != 0) {
					for (int k = 0; k < cArr.length; k++) {
						if(j != s.length()-1) {
							if (cArr[k] == s.charAt(j+1) && cArr[k] != s.charAt(j)) {
								flag = false;
								break;
							}
						}
					}
					cArr[j] = s.charAt(j);
				} else {
					cArr[j] = s.charAt(j);
				}
			}
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
	}
}
