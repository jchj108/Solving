package question75.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {

		ValidAnagram va = new ValidAnagram();

		String s = "anagram";
		String t = "nagaram";

		va.isAnagram(s, t);

	}

	public boolean isAnagram(String s, String t) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : t.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) - 1);
		}
		for(Character c : map.keySet()) {
			if(map.get(c) != 0) {
				return false;
			}
		}
		
		
		return true;
	}

}
