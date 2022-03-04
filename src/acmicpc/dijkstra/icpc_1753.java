package acmicpc.dijkstra;

import java.util.*;
import java.io.*;

public class icpc_1753 {

    static int V, E; // 정점 , 간선
    static int K; // 시작점

    static int INF = 100000000;

    static int graph[][];
    static int Dist[];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());

        graph = new int[V+1][V+1];
        Dist = new int[V+1];
        for(int i = 1 ; i <= V ; i++){
            for(int j = 1 ; j <= V ; j++){
                if(i == j ) graph[i][j] = 0;
                else graph[i][j] = INF;
            }
        }

        for(int i = 1 ; i <= E ; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph[u][v]  = w;
        }
        br.close();

        dijkstra();
        for(int i = 1 ; i <= V ; i ++){
            if(Dist[i] == INF) System.out.println("INF");
            else System.out.println(Dist[i]);
        }
    }

    private static void dijkstra(){
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        boolean visited[] = new boolean[V + 1];
        for(int i = 1 ; i <= V ; i++) Dist[i] = INF;
        Dist[K] = 0;
        pq.add(new int[] {0, K});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int u = curr[1];
            if(visited[u]) continue;

            visited[u] = true;
            for(int v = 1 ; v <= V ; v ++){
                if(Dist[v] > Dist[u] + graph[u][v]){
                    Dist[v] = Dist[u] + graph[u][v];
                    pq.add(new int[] { Dist[v], v });
                }
            }
        }

    }
}
