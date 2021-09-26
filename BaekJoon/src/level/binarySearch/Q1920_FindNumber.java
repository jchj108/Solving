package level.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 이진 탐색으로 풀어야한다.
public class Q1920_FindNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>(N);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list2 = new ArrayList<Integer>(M);
		for(int i = 0; i < M; i ++) {
			list2.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i = 0; i < list2.size(); i++) {
			boolean flag = false;
			for(int j = 0; j < list.size(); j++) {
				if(list.contains(list2.get(i))) {
					flag = true;
					break;
				}
			}
			if(flag) {
				bw.write("1\n");
			} else {
				bw.write("0\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
