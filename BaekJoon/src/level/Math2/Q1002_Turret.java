package level.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1002_Turret {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// r1, r2�� �ڿ����̹Ƿ� �밢�� �Ÿ��� ������ �� �Ǽ� ���� �񱳸� ���� �Ǽ��� ������. 
		// �Ǽ� ���� �񱳴� �Ǽ��� %1�� ���༭ �������� �ִٸ� �Ǽ��̴�.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] coord1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			int r1 = Integer.parseInt(st.nextToken());
			int[] coord2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			int r2 = Integer.parseInt(st.nextToken());
			
			// coord1[0]���� + coord1[1]���� == ��Ʈr1�� ������� ���� �ﰢ��(���Ѵ�)
			
		}
	}
}
