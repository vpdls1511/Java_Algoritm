package acmicpc.dfs_bfs;

import java.io.*;
import java.util.*;

public class icpc_2606{

    static int maxNode = 101;
    static int[][] graph = new int[maxNode][maxNode];
    static boolean[] visited = new boolean[maxNode];
    static int cnt = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < K ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(String.valueOf(st.nextToken()));
            int v = Integer.parseInt(String.valueOf(st.nextToken()));

            graph[u][v] = graph[v][u] = 1;
        }


        dfs(1, N);
        System.out.println(cnt);

    }

    private static void dfs(int node , int N){
        visited[node] = true;

        for(int i = 1 ; i <= N ; i++){
            if(!visited[i] && graph[node][i] != 0){
                dfs(i, N);
                cnt++;
            }
        }
    }
}
