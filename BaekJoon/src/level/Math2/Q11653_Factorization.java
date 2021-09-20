package level.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q11653_Factorization {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int i = 2; i <= N; i++) {
			if(N % i == 0) {
				System.out.println(i);
				N /= i;
				i--;
			}
		}
	}
}


//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int N = Integer.parseInt(br.readLine());
//        int i = 2;
//        while (N != 1) {
//            if (N % i == 0) {
//                N /= i;
//                //System.out.println(i);
//                bw.write(String.valueOf(i) + "\n");
//            } else {
//                i++;
//            }
//        }
//
//        bw.flush();
//        br.close();
//        bw.close();
//
//
//    }
//}