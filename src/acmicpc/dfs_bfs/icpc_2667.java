package acmicpc.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class icpc_2667 {
    static int[][] delta = {{-1, 0}, {1,0}, {0,-1}, {0,1}};
    static int[][] house;
    static boolean[][] visited;
    static ArrayList<Integer> arr = new ArrayList<>();

    static class Point {
        int row, col;
        public Point(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner 보다 입력 속도가 빠름
        int N = Integer.parseInt(br.readLine());
        house = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0 ; i < N ; i ++){
            String str = br.readLine();
            for(int j = 0 ; j < N ; j ++){
                house[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
                if(house[i][j] == 0) visited[i][j] = true; // 0으로 들어온 모든 것들을 방문한것으로 체크
            }
        }

        for(int i = 0 ; i < N ; i ++){
            for(int j = 0 ; j < N ; j ++){
                if(!visited[i][j]) bfs(i,j,N); // 방문하지 않은 좌표 접근 시 bfs 함수 호출
            }
        }

        Collections.sort(arr);
        System.out.println(arr.size());
        for(int i = 0 ; i < arr.size() ; i ++){
            System.out.println(arr.get(i));
        }
    }

    private static void bfs(int i , int j, int size){
        Queue<Point> q = new LinkedList<>(); // bfs는 Queue원리이므로, Point자료형인 Queue를 LinkedList로 선언
        int cnt = 0; // 색칠할 node의 개수
        q.add(new Point(i,j)); // q에 첫 좌표 입력
        visited[i][j] = true; // 첫 좌표 방문처리

        while(!q.isEmpty()){ // q가 아무것도 없을때까지
            Point curr = q.poll(); // q를 dequeue 시킬값을 curr에 저장하고 dequeue
            cnt++; // cnt 증가

            for(int k = 0 ; k < 4 ; k ++){ // 상하좌우 검색
                int row = curr.row + delta[k][0];
                int col = curr.col + delta[k][1];

                if(row < 0 || row >= size || col < 0 || col >= size ) continue; // 검색 범위가 index를 넘어가면 다음 반복문 실행
                if(!visited[row][col]){ // visited(row,col)을 방문하지 않았다면
                    visited[row][col] = true; // 방문해주고
                    q.add(new Point(row, col)); // queue에 추가
                }
            }
        }
        arr.add(cnt); // while문이 다 돌아가면 한 단지를 다 센거니, arr에 추가
    }


}
