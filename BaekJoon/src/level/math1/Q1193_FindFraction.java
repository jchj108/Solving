package level.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1193_FindFraction {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		int count = 0;
		int position = 0;
		
		for(int offset = 1, i = 1; i <= X; i++) {
			int endpoint = offset - 1;
			
			if(X - offset < i) {
				System.out.println(offset);
				count = i; // count: �밢�� ���� �� ����
				position = X - endpoint; // position : �밢�� ��������κ����� �Ÿ�
				break;
			}
			offset += i; // ���� ���� �밢�� ����
		}
		
		if(count % 2 == 0) {
			System.out.println(position + "/" + (count+1-position));
		} else {
			System.out.println((count+1-position) + "/" + position);
		}
	}
}

//			System.out.println(i + "��° offset : " + offset);
// �и� ������ �� : i+1
// ĭ�� ���� : i
// i % 2 == 0 �� �� ������� ������ �Ʒ� 

//			System.out.println("X - offset - 1 = " + (int)X + "-" + (int)offset + "-1 =" + (int)(X-offset-1));
//				System.out.println("X");
//		System.out.println("position : " + position);
//		System.out.println(count);
//		System.out.println(answer);

//			if(X > i + offset) { // ���� ���� ����
//				
//			}
//			
//			
//			


//			if(X % i == 1 && X >= start-i-1) { // �밢�� ���
//				sb.append(i+"/"+i);
//			}