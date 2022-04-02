package test;

public class B {
	
	public static void main(String[] args) {
		long result = findRange(123512);

	}

	public static long findRange(int num) {

		String s = String.valueOf(num);
		int[] arr = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i) - '0';
		}
		
//		long min = getMin(num, arr);
		long max = getMax(num, arr);
		
		System.out.println(max);
//		return max - min;
		return 1;
	}

	private static long getMax(int num, int[] arr) {
		
		int start = arr[0];
		String temp = "";
		
		if(start != 9) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] != 9) {
					start = arr[i];
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == start) {
				arr[i] = 9;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			temp += arr[i] - '0';
		}
		
		return Integer.parseInt(temp);
	}

	private static long getMin(int num, int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

}
