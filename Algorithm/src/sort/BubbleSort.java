package sort;

public class BubbleSort {
	
	public void sort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp;
				if(arr[j] <  arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public void swap()
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {3, 2, 5, 6, 1}; 
		
		new BubbleSort().sort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
