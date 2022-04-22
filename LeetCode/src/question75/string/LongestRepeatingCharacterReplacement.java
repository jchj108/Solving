package question75.string;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {

		int result = characterReplacement("ABBB", 1);

		System.out.println("result : " + result);

	}

	public static int characterReplacement(String s, int k) {

		int l = 0, r = 0, cnt = 0, max = 0;

		while (r < s.length()) {

			if (s.charAt(r) == s.charAt(l)) {
				r++;
			} else if (cnt < k) {
				if (cnt != k) {
					r++;
				}
				cnt++;
			} else {
				cnt = 0;
				l++;
				r = l;
			}
			max = Math.max(max, r - l);
		}
		return max;
	}
}
