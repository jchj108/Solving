package level.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085_Rectangle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int minWidth = 0;
		int minHeight = 0;
		
		if(w - x < x) {
			minWidth = w - x;
		} else {
			minWidth = x;
		}
		
		if(h - y < y) {
			minHeight = h - y;
		} else {
			minHeight = y;
		}
		
		System.out.println(minWidth > minHeight ? minHeight : minWidth);
	}
}
