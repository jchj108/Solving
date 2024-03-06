package dp;

import java.io.*;
import java.util.*;

public class Backpacking {

    public static int dp[][];
    static int[] w, v;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        dp = new int[n+1][k+1];
        w = new int[n+1];
        v = new int[n+1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(str.nextToken());
            v[i] = Integer.parseInt(str.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (j >= w[i]) {
                    dp[i][j] = Math.max(dp[i -1][j], dp[i][j-w[i]] + v[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        bw.write(Integer.toString(dp[n][k]));
        bw.flush();
        bw.close();
    }
}


