package question75.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		int result = lengthOfLongestSubstring("pwwkew");

		System.out.println(result);
	}

	public static int lengthOfLongestSubstring(String s) {
		
		int l = 0;
		int r = 0;
		int max = 0;
		
		Set<Character> set = new HashSet<Character>();
		
		while(r < s.length()) {
			if(r == s.length()) {
				break;
			}
			if(!set.contains(s.charAt(r))) {
				set.add(s.charAt(r++));
				max = Math.max(r-l, max);
			} else {
				set.remove(s.charAt(l++)); // 중복을 만나면 중복 원소 전부 삭제. l과 r이 만나게 됨
			}
		}
		return max;
	}
}
