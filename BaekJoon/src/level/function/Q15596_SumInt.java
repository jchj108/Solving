package level.function;

public class Q15596_SumInt {
	
	
	private long sum(int[] a) {
		
		long l = 0;
		
		for(int i = 0; i < a.length; i++) {
			l += a[i];
		}
		return l;
	}

}
