package acmicpc.dfs_bfs;

import java.util.ArrayList;
import java.util.Scanner;

public class icpc_1260 {
    static int MAX_INT = 20;

    static int N,M;
    static int V;

    static boolean[] visited = new boolean[MAX_INT];
    static int[][] graph = new int[MAX_INT][MAX_INT];

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        V = in.nextInt();

        for(int i = 1 ; i < M ; ++i){
            int u = in.nextInt();
            int v = in.nextInt();

            graph[u][v] = graph[v][u] = 1;
        }
        dfs(V);
        System.out.println("");
    }

    private static void dfs(int node){
        visited[node] = true;
        System.out.print(node + " ");
        for (int next = 1 ; next <= N ; ++next){
            if(!visited[next] && graph[node][next]!=0){
                dfs(next);
            }
        }
    }

    private static void bfs(){

    }
}
