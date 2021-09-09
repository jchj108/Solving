package level.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4344_GetAVG {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			double[] arr = null;
			arr = new double[N];
			for(int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			double avg = OverAvg(arr);
			sb.append(String.format("%.3f", Math.round(avg * 1000.0)/1000.0)).append('%').append('\n');
		}
		System.out.println(sb.toString());
	}

	private static double OverAvg(double[] arr) {
		
		double sum = 0; 
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = sum / arr.length; 
		int count = 0; 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > avg) {
				count++;
			}
		}
		return count / (double)arr.length * 100;
	}
}
