package acmicpc.dfs_bfs;

import java.io.*;
import java.util.*;

public class icpc_14502 {

    static int[] row = {-1,1,0,0};
    static int[] col = {0,0,-1,1};

    static class Loc{
        int row , col;
        public Loc(int row , int col){
            this.row = row;
            this.col = col;
        }
    }

    static int maxSize = 8;
    static int[][] map ;
    static int[][] tempMap ;

    static Queue<Loc> q = new LinkedList<>();

    static int N, M;
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        tempMap = new int[N][M];

        for(int i = 0 ; i < N ; i ++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < M ; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        wall(0);

        System.out.println(result);

    }

    private static void wall(int cnt){
        if(cnt >= 3){
            bfs();
            return;
        }

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                if(map[i][j] == 0){
                    map[i][j] = 1;
                    wall(cnt + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    private static void bfs(){
        int count = 0;
        findVirus();
        while(!q.isEmpty()){
            Loc curr = q.poll();
            for(int i = 0 ; i < 4 ; i ++){
                int tRow = curr.row + row[i];
                int tCol = curr.col + col[i];

                if(tRow < 0 || tRow >= N || tCol < 0 || tCol >= M) continue;
                if(tempMap[tRow][tCol] == 0){
                    tempMap[tRow][tCol] = 2;
                    q.add(new Loc(tRow, tCol));
                }
            }
        }

        for(int i = 0 ; i < N ; i ++){
            for(int j = 0 ; j < M ; j++){
                if(tempMap[i][j] == 0) count++;
            }
        }

        result = Math.max(result, count);
    }

    private static void findVirus(){
        for(int i = 0 ; i < N ; i ++){
            for(int j = 0 ; j < M ; j++){
                tempMap[i][j] = map[i][j]; // 맵 복사
                if(map[i][j] == 2) q.add(new Loc(i,j));
            }
        }
    }

    private static void resetMap(){
        for(int i = 0 ; i < N ; i ++){
            for(int j = 0 ; j < M ; j++){
                tempMap[i][j] = map[i][j];
            }
        }
    }
}
