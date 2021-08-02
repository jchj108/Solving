package level1.test;

public class VocaGame {
	
    public int solution(String s) {
    	
    	String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	for(int i = 0; i < arr.length; i++) {
    		s =	s.replaceAll(arr[i], Integer.toString(i));
    	}
		return Integer.parseInt(s);
    }

	public static void main(String[] args) {
		new VocaGame().solution("one4seveneight");
	}
}
