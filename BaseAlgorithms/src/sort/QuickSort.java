package sort;

public class QuickSort {

	
	/*
	 * Ư���� ��(�Ǻ�)�� �������� ū ���ڿ� ���� ���ڸ� ������
	 * �Ǻ����� ���� �� ����, ū �� ������
	 */
	public static void main(String[] args) {
		int[] data = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int number = 10;
		
		quickSort(data, 0, number - 1);
		for(int i : data) {
			System.out.println(data);
		}
	}
	
	public static void quickSort(int[] data, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int key = start;
		int i = start + 1;
		int j = end;
		int temp;
		
		while(i <= j) { // ������ ������ �ݺ�
			while(data[i] <= data[key]) {
				i++;
			}
			while(data[j] >= data[key] && j > start) {
				j--;
			}
			if(i > j) {// ������ ���¸� Ű ���� ��ü
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			} else {
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
		}
		
		quickSort(data, start, j - 1);
		quickSort(data, j+1, end);
	}
}
