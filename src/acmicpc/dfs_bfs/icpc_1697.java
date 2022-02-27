package acmicpc.dfs_bfs;


// 걸을 때 ::  1초 후 x + 1 or x - 1
// 순간이동 때 ::  1초 후 2 * x

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class icpc_1697 {

    static int[] distance = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if(N == K) {
            System.out.println(0);
            return;
        }

        distance[N] = 1;

        bfs(N, K);
    }

    private static void bfs(int n , int k){
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int i = 0 ; i < 3 ; i++){ // - + * 케이스 다 넣어보기
                int next = 0;

                if(i == 0) next = temp-1;
                if(i == 1) next = temp+1;
                if(i == 2) next = temp*2;

                if(next == k){
                    System.out.println(distance[temp]);
                    return;
                }

                if(next < 0 || next >= distance.length || distance[next] != 0) continue; // 이 조건과 다르면


                q.add(next); //큐에 추가하고
                distance[next] = distance[temp]+1; //distande[temp]의 값에 +1을 한 값을 distance[next]에 삽입

            }
        }
    }
}
