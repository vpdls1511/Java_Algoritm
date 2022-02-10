package acmicpc.dp;

import java.util.Scanner;

public class icpc_2579 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] DP = new int[301];
        for(int i = 1 ; i <= N ; i++){
            DP[i] = in.nextInt();
        }
        System.out.println(solution(DP, N));
    }
    public static int solution(int[] DP, int N){
        int[] COST = new int[301];
        COST[1] = DP[1];
        COST[2] = DP[1] + DP[2];
        COST[3] = Math.max(DP[1] , DP[2]) + DP[3];

        for(int i = 4 ; i <= N ; i++){
            COST[i] = Math.max(DP[i-1] + COST[i-3] , COST[i-2]) + DP[i];
        }
        return COST[N];
    }
}

/* 0 10 20 15 25 10 20 */