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
		
		int fixedCost = Integer.parseInt(st.nextToken()); // ���� ���
		int variableCost = Integer.parseInt(st.nextToken()); // ���� ���
		int price = Integer.parseInt(st.nextToken()); // �Ǹ� ����
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
