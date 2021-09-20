package level.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941_CroatiaAlphabet {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		s = s.replace("c=", "0");
		s = s.replace("c-", "0");
		s = s.replace("dz=", "0");
		s = s.replace("d-", "0");
		s = s.replace("lj", "0");
		s = s.replace("nj", "0");
		s = s.replace("s=", "0");
		s = s.replace("z=", "0");
		
		System.out.println(s.length());
	}
}
	
	
	/* 다른 사람의 풀이 
	 	    String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
	    
	    for(int i=0;i<arr.length;i++) {
	        if(S.contains(arr[i])) {
	            S=S.replaceAll(arr[i]," ");
	            }
	        } 
	 */

