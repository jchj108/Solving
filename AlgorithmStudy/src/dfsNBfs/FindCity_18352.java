package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class FindCity_18352 {

	static int N, M, K, X;
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // ������ ����
		M = Integer.parseInt(st.nextToken()); // ������ ����
		K = Integer.parseInt(st.nextToken()); // �Ÿ� ����
		X = Integer.parseInt(st.nextToken()); // ��� ������ ��ȣ
		
		visited = new boolean[N+1];
		LinkedList<Integer>[] adjList = new LinkedList[N+1];
		
		
	}

}
