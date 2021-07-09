package level.For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q15552 {

	public static void main(String[] args) throws IOException {

//		token();
//		split1();
//		split2();
		shorts();
	}

	public static void token() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int test = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}

		br.close();

	}

	public static void split1() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test = Integer.parseInt(br.readLine());

		for (int i = 0; i < test; i++) {
			String num[] = br.readLine().split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);

			bw.write(a + b + "\n"); // 담아뒀다 한 번에 출력
		}
		br.close();
		bw.flush();
		bw.close();
	}

	public static void split2() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < test; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
		}
		br.close();

		System.out.println(sb);
	}

	public static void shorts() {

		Scanner scan = new Scanner(System.in);
		StringBuilder s = new StringBuilder();

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			s.append(x + y + "\n");
		}

		System.out.print(s);
	}
}

//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
//	String input = "";
//	while((input = br.readLine()) != null) {
//	    String[] num = input.split(" ");
//	    int result  = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
//	}