package acmicpc.dfs_bfs;

import java.io.*;
import java.util.*;

public class icpc_1012 {


    static int maxSize = 51;
    static int[][] graph = new int[maxSize][maxSize];
    static int[] row = { -1 , 1 , 0 , 0 };
    static int[] col = { 0 , 0 , -1 , 1 };

    private static class Location{
        int row, col;
        public Location(int row, int col){
            this.row = row;
            this.col = col;
        }
    }


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int k = 0 ; k < T ; k++){

            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            int cnt = 0;

            for(int i = 0 ; i < V ; i++){
                StringTokenizer str = new StringTokenizer(br.readLine());

                int u = Integer.parseInt(str.nextToken());
                int v = Integer.parseInt(str.nextToken());

                graph[u][v] = 1;
            }

            for(int i = 0 ; i < N ; i ++){
                for(int j = 0 ; j < M ; j ++){
                    if(graph[i][j] == 1){
                        bfs(i,j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);

        }
    }

    private static void bfs(int x, int y){
        Queue<Location> q = new LinkedList<>();
        q.add(new Location(x,y));
        graph[x][y] = 0;

        while(!q.isEmpty()){
            Location curr = q.poll();

            for(int i = 0 ; i < 4 ; i++){
                int tRow = curr.row + row[i];
                int tCol = curr.col + col[i];

                if(tRow < 0  || tRow > maxSize || tCol < 0 || tCol > maxSize) continue;
                if(graph[tRow][tCol] == 0) continue;

                q.add(new Location(tRow, tCol));
                graph[tRow][tCol] = 0;
            }
        }
    }
}
