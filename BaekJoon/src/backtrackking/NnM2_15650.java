package backtrackking;

import java.util.Scanner;

public class NnM2_15650 {
	
    static int n;
    static int m;
    static int[] combi;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        combi = new int[m];

        dfs(0,1);
    }

        static void dfs(int L,int start){
        if(L==m){
            for(int a : combi){
                System.out.print(a+" ");
            }
            System.out.println();
        }
        else{
            for(int i=start;i<=n;i++){
                combi[L] = i;
                dfs(L+1,i+1);
            }
        }
    }
}