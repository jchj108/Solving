package level1.test;

import java.util.ArrayList;

public class RemoveOverlap {

	public int[] solution(int[] arr) {

//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(arr[0]);
//		
//		for(int i = 1; i < arr.length; i++) {
//			if(arr[i-1] != arr[i]) {
//				list.add(arr[i]);
//			}
//		}
//		int[] answer = new int[list.size()];
//		
//		for(int i = 0; i < list.size(); i++) {
//			answer[i] = list.get(i);
//		}
//		
//		return answer;

		ArrayList<Integer> tempList = new ArrayList<Integer>();
		int preNum = 10;
		for (int num : arr) {
			if (preNum != num)
				tempList.add(num);
			preNum = num;
		}
		int[] answer = new int[tempList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = tempList.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {

		RemoveOverlap rol = new RemoveOverlap();

		int[] arr = new int[] { 1, 1, 3, 3, 0, 1, 1 };
		int[] answer = rol.solution(arr);

		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}

}
