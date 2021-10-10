package sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		int j, temp;
		for (int i = 0; i < 9; i++) {
			j = i;
			while (array[j] > array[j + 1]) {
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
				j--;
			}
		}
		for(int i : array) { // 정렬 완료
			// 삽입 정렬은 거의 정렬이 되어 있는 상태에서 빠르다.
			// O^2의 시간 복잡도를 가지지만 O^2 알고리즘 중에서는 가장 빠른 편이다.
			System.out.println(i);
		}
	}

}
