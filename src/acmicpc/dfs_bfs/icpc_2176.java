package acmicpc.dfs_bfs;

import java.io.*;
import java.util.*;

public class icpc_2176 {

    static int[][] arr;
    static int[] row = {-1 , 1 , 0 , 0};
    static int[] col = {0 , 0 , -1 , 1};

    private static class Point{
        int row, col;
        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];


        for(int i = 0 ; i < N ; i++){
            String str = br.readLine();
            for(int j = 0 ; j < M ; j++){
                arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        bfs(N,M);

        System.out.println(arr[N-1][M-1]);
    }

    private static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0,0));

        while(!queue.isEmpty()){
            Point curr = queue.poll();
            for(int i = 0 ; i < 4 ; i++){
                int tRow = curr.row+row[i];
                int tCol = curr.col+col[i];

                if(tRow < 0 || tRow > x-1 || tCol < 0 || tCol > y-1) continue;

                if(arr[tRow][tCol] == 1 ) {
                    queue.add(new Point(tRow, tCol));
                    arr[tRow][tCol] = arr[curr.row][curr.col] + 1;
                }
            }
        }
    }
}
