package dfsNBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class KnightShift_7562 {
 
    static int T, N;
    static boolean visited[][];
    static int[] dr = { -1, -2, -2, -1, 1, 2, 2, 1 }, dc = { -2, -1, 1, 2, -2, -1, 1, 2 };
    static State start, end;
 
    static class State {
        int r, c, dist = 0;
        public State(int x, int y, int dist) {
            this.r = x;
            this.c = y;
            this.dist = dist; // 나이트의 이동횟수
        }
    }
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
 
            N = Integer.parseInt(br.readLine());
            visited = new boolean[N][N];
 
            // 나이트의 현재 위치
            st = new StringTokenizer(br.readLine());
            start = new State(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            // 나이트가 이동하려고 하는 위치
            st = new StringTokenizer(br.readLine());
            end = new State(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            
            System.out.println(bfs());
        }
 
    }
 
    private static int bfs() {
        
        Queue<State> q = new LinkedList<>();
        q.add(start);
        visited[start.r][start.c] = true;
        
        while(!q.isEmpty()) {
            State now = q.poll();
            // 도착 지점에 도달하면
            if(now.r == end.r && now.c == end.c)
                return now.dist;
            // 나이트처럼 8방 탐색
            for (int d = 0; d < 8; d++) {
                int rr = now.r + dr[d];
                int cc = now.c + dc[d];
                // 범위를 벗어나면 pass
                if(rr < 0 || cc < 0 || rr >= N || cc >= N) continue;
                // 이미 방문한 적이 있다면 pass
                if(visited[rr][cc]) continue;
                
                visited[rr][cc] = true;
                q.add(new State(rr, cc, now.dist + 1));
            }
        }
        return 0;
    }
 
}


