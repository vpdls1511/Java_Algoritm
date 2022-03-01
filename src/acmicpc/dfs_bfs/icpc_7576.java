package acmicpc.dfs_bfs;

import java.io.*;
import java.util.*;

public class icpc_7576 {

    static int[][] field;
    static int[] row = {-1, 1, 0, 0};
    static int[] col = {0, 0, -1, 1};

    static Queue<Loc> q = new LinkedList<>();

    static class Loc{
        int row, col;
        public Loc(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        field = new int[N][M];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < M ; j++){
                field[i][j] = Integer.parseInt(st.nextToken());
                if(field[i][j] == 1){
                    q.add(new Loc(i,j));
                }
            }
        }


        System.out.println(bfs(N-1, M-1));

    }

    private static int bfs(int x, int y){
        while(!q.isEmpty()){
            Loc curr = q.poll();
            for(int i = 0 ; i < 4 ; i ++){
                int tRow = curr.row + row[i];
                int tCol = curr.col + col[i];

                if(tRow < 0 || tRow > x || tCol < 0 || tCol > y) continue;
                if(field[tRow][tCol] == -1) continue;
                if(field[tRow][tCol] == 0){
                    field[tRow][tCol] = field[curr.row][curr.col] + 1;
                    q.add(new Loc(tRow, tCol) );
                }
            }}

        int value = Integer.MIN_VALUE;

        for(int i = 0 ; i <= x ; i++){
            for(int j = 0 ; j <= y ; j++){
                if(field[i][j] == 0){
                    return -1;
                }else{
                    value = Math.max(field[i][j] , value);
                }
            }
        }

        if(value == 1) return 0;
        else return value - 1;
    }

}
