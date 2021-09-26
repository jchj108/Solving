package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q1271_BigRich {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger num1 = new BigInteger(st.nextToken());
		BigInteger num2 = new BigInteger(st.nextToken());
		
		System.out.println(num1.divide(num2));
		System.out.println(num1.mod(num2));
	}
}
