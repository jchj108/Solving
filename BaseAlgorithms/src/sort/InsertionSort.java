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
		for(int i : array) { // ���� �Ϸ�
			// ���� ������ ���� ������ �Ǿ� �ִ� ���¿��� ������.
			// O^2�� �ð� ���⵵�� �������� O^2 �˰����� �߿����� ���� ���� ���̴�.
			System.out.println(i);
		}
	}

}