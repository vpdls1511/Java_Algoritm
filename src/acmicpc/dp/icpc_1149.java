package acmicpc.dp;

import java.util.Scanner;

public class icpc_1149 {

    final static int RED = 0;
    final static int GREEN = 1;
    final static int BLUE = 2;

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] DP = new int[N][3];
        for(int i = 0 ; i < N ; i++){
            DP[i][RED] = scan.nextInt();
            DP[i][GREEN] = scan.nextInt();
            DP[i][BLUE] = scan.nextInt();
        }

        System.out.println(solution(DP, N));
    }

    public static int solution(int[][] DP, int N){

        for(int i = 1 ; i < N ; i++){
            DP[i][RED] += Math.min( DP[i-1][GREEN] , DP[i-1][BLUE] );
            DP[i][GREEN] += Math.min( DP[i-1][RED] , DP[i-1][BLUE] );
            DP[i][BLUE] += Math.min( DP[i-1][GREEN] , DP[i-1][RED] );
        }

        return Math.min(DP[N-1][RED],Math.min( DP[N-1][GREEN] , DP[N-1][BLUE] ));
    }
}
