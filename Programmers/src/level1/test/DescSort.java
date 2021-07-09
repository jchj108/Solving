package level1.test;

import java.util.Arrays;

public class DescSort {
	public long Solution(long n) {
		long answer = 0;
		
		String str = Long.toString(n);
		char[] cArr = str.toCharArray();
		String str2 = "";
		
		Arrays.sort(cArr);
		
		for(int i = cArr.length-1; i>=0; i--) {
			str2 += cArr[i];
			//내림차순
		}
		
		answer = Long.parseLong(str2);
		return answer; 
		
		
	}
	
	public static void main(String[] args) {
		
	}
}


