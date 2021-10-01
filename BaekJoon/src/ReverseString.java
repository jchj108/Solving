
public class ReverseString {

	public static void main(String[] args) {
		String s = "Hello World!";
		
		char[] input = s.toCharArray();
		char[] output = new char[input.length];
		for(int i = 0; i < input.length; i++) {
			output[input.length-i-1] = input[i];
		}
		
		String reversed = new String(output);
		System.out.println(reversed);
	}
}
