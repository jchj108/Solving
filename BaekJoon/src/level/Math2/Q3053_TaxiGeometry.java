package level.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3053_TaxiGeometry {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ���� ���� : ����r����
		// �ý� ������ : r����*2
		
		double R = Integer.parseInt(br.readLine());
		
		System.out.printf("%.6f\n", Math.PI*R*R);
		System.out.printf("%.6f", R*R*2);
		
	}
	
}
