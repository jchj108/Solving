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
				count = i; // count: 대각선 라인 수 저장
				position = X - endpoint; // position : 대각선 출발점으로부터의 거리
				break;
			}
			offset += i; // 이하 다음 대각선 라인
		}
		
		if(count % 2 == 0) {
			System.out.println(position + "/" + (count+1-position));
		} else {
			System.out.println((count+1-position) + "/" + position);
		}
	}
}

//			System.out.println(i + "번째 offset : " + offset);
// 분모 분자의 합 : i+1
// 칸의 개수 : i
// i % 2 == 0 일 때 진행방향 위에서 아래 

//			System.out.println("X - offset - 1 = " + (int)X + "-" + (int)offset + "-1 =" + (int)(X-offset-1));
//				System.out.println("X");
//		System.out.println("position : " + position);
//		System.out.println(count);
//		System.out.println(answer);

//			if(X > i + offset) { // 다음 라인 기준
//				
//			}
//			
//			
//			


//			if(X % i == 1 && X >= start-i-1) { // 대각선 가운데
//				sb.append(i+"/"+i);
//			}