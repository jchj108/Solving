package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class StartLink_5014 {
	
	static int F, S, G, U, D;
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		F = Integer.parseInt(st.nextToken()); // Floor
		S = Integer.parseInt(st.nextToken()); // Start
		G = Integer.parseInt(st.nextToken()); // Goal
		U = Integer.parseInt(st.nextToken()); // Up
		D = Integer.parseInt(st.nextToken()); // Down
		
		visited = new boolean[F+1];
		int result = bfs();
		if(result == -1) {
			System.out.println("use the stairs");
		} else {
			System.out.println(result);
		}
	}

	private static int bfs() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(new Node(S, 0));
		visited[S] = false;
		
		while(!q.isEmpty()) {
			Node cur = q.remove();
			
			if(cur.x == G) {
				return cur.dist;
			}
			if(cur.x + U <= F && !visited[cur.x + U]) {
				q.add(new Node(cur.x + U, cur.dist + 1));
				visited[cur.x+U] = true;
			} 
			if(cur.x - D >= 1 && !visited[cur.x - D]) {
				q.add(new Node(cur.x - D, cur.dist + 1));
				visited[cur.x-D] = true;
			}
		}
		// BFS 호출 1회전만에 G에 닿지 못하면
		return -1;
	}
	
	private static class Node {
		int x;
		int dist;
		public Node(int x, int dist) {
			this.x = x;
			this.dist = dist;
		}
	}
}
