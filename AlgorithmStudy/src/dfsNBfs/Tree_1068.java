package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tree_1068 {

	static ArrayList<Integer>[] tree;
	static boolean[] visited;
	static int delete;
	static int answer;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		tree = new ArrayList[N];
		visited = new boolean[N];
		int root = 0;
		for(int i = 0; i < tree.length; i++) {
			tree[i] = new ArrayList();
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int parent = Integer.parseInt(st.nextToken());
			if(parent != -1) {
				tree[i].add(parent);
				tree[parent].add(i);
			} else {
				root = i; // 부모노드가 없다면 루트노드
			}  
		}
		delete = Integer.parseInt(br.readLine());
		if(delete == root) { // 루트노드를 삭제한 경우
			System.out.println(0);
		} else {
			dfs(root);
			System.out.println(answer);
		}
	}

	private static void dfs(int node) {
		visited[node] = true;
		int child = 0;
		for(int i = 0; i < tree[node].size(); i++) {
			int adjNode = tree[node].get(i);
			if(visited[adjNode] == false && adjNode != delete) {
				child++;
				dfs(adjNode);
			}
		}
		if(child == 0) {
			answer++;
		}
		
	}
}
