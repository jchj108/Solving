package level.Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1712_breakEvenPoint {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int fixedCost = Integer.parseInt(st.nextToken()); // 고정 비용
		int variableCost = Integer.parseInt(st.nextToken()); // 가변 비용
		int price = Integer.parseInt(st.nextToken()); // 판매 수익
		if(variableCost >= price) {
			bw.write(-1+"\n");
			bw.flush();
		} else {
			bw.write(fixedCost / (price - variableCost) + 1 + "\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
