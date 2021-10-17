package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2309_SevenDwarf {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>(10);
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			list.add(Integer.parseInt(br.readLine()));
			sum += list.get(i);
		}
		Collections.sort(list);
		loops:
		for(int i = 0; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++) { 
				if(sum - list.get(i) - list.get(j) == 100) { // 9 �������� Ű���� �� �������� Ű�� �� ���� 100�̶��
					for (int k = 0; k < list.size(); k++) {
						if(i == k || j == k) { // i j ����
							continue;
						}
						System.out.println(list.get(k));
					}
					break loops;
				}
			}
		}
	}
}
