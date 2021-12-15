package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class FindCity_18352 {
	
	static int N, M, K;
	static Node X;
	static boolean[] visited;
	static ArrayList<Integer>[] adjList;
	
	static class Node {
		int dist;
		int num;
		
		public Node(int num, int dist) {
			this.dist = dist;
			this.num = num;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // Vertex
		M = Integer.parseInt(st.nextToken()); // edge
		K = Integer.parseInt(st.nextToken()); // distance
		X = new Node(Integer.parseInt(st.nextToken()), 0); // start node

		visited = new boolean[N+1];
		
		adjList = new ArrayList<>();
		for(int i = 0; i <= N; i++) {
			adjList.add(new ArrayList<Node>());
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			adjList.get(x).add(new Node(y, 0)); // x 노드 to y 노드
		}
		
//		show();
		bfs(X);
	}

	private static void bfs(Node X) {
		Queue<Node> q = new LinkedList<>();
		q.add(X); // 큐에 시작노드 추가(마킹처리)
		
		while(!q.isEmpty()) {
			Node n = q.poll();
			for(int i = 0; i < adjList.get(n.num).size(); i++) {
				Node next = adjList.get(n.num+1).get(i);
				
				if(!visited[next.num]) {
					visited[next.num] = true;
					q.add(new Node(next.num, next.dist + 1));
					System.out.println(n.dist);
				}
			}
		}
	}

	private static void show() {
		for(int i = 1; i < adjList.size(); i++) {
			System.out.print(i + "번째 노드 : ");
			for(int j = 0; j < adjList.get(i).size(); j++) {
				System.out.print(adjList.get(i).get(j).num + " " + "(" + adjList.get(i).get(j).dist+")");
				
			}
			System.out.println();
		}
	}
}
