package guides.begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ball {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		
		boolean[] arr = {true, false, false}; // 1, 2, 3
		
		for(int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken()) -1; 
			int Y = Integer.parseInt(st.nextToken()) -1;
			
			boolean temp = arr[X];
			arr[X] = arr[Y];
			arr[Y] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == true) {
				System.out.println(i+1);
			}
		}
	}
}
