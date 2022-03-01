package acmicpc.dfs_bfs;

import java.io.*;
import java.util.*;

public class icpc_11724 {

    static int maxSize = 1001;
    static int[][] graph = new int[maxSize][maxSize];
    static boolean[] visited = new boolean[maxSize];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for(int i = 0 ; i < M ; i ++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = graph[v][u] = 1;
        }

        for(int i = 1 ; i <= N ; i++){
            if(!visited[i]){
                dfs(i , N);
                cnt ++;
            }
        }

        System.out.println(cnt);

    }

    static void dfs(int node, int N){
        visited[node] = true;

        for( int i = 1 ; i <= N ;i++){
            if(!visited[i] && graph[node][i] == 1) dfs(i, N);
        }
    }
}
