package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class FindCity_18352 {
	
	static int N, M, K, X;
	static int[] dist;
	static ArrayList<ArrayList<Integer>> adjList;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // Vertex
		M = Integer.parseInt(st.nextToken()); // edge
		K = Integer.parseInt(st.nextToken()); // distance
		X = Integer.parseInt(st.nextToken()); // start node

		dist = new int[N+1];
		adjList = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i <= N; i++) {
			adjList.add(new ArrayList<Integer>());
			dist[i] = -1;
		}
		
		dist[X] = 0;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			adjList.get(x).add(y);
		}
		
		bfs();
		
		boolean flag = false;
		for(int i = 0; i < dist.length; i++) {
			if(dist[i] == K) {
				System.out.println(i);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println(-1);
		}
		
	}

	private static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(X);
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			
			for(int i = 0; i < adjList.get(cur).size(); i++) {
				int next = adjList.get(cur).get(i);
				
				if(dist[next] == -1) {
					dist[next] = dist[cur]+1;
					q.add(next);
				}
			}
		}
	}
}
