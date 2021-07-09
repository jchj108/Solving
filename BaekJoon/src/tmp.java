
public class tmp {
	public static void arr() {

		int[] arr = { 1,2,3,4,5 };
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		long lnum = 99999999999999999l;
		float fnum = lnum;
		
		System.out.println(fnum);
		
	}

	public static void main(String[] args) {
		tmp t = new tmp();
		tmp.arr();
	}
	
}

	