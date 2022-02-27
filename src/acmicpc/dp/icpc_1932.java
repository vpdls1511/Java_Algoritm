package acmicpc.dp;

import java.util.Arrays;
import java.util.Scanner;

public class icpc_1932 {
    static int DP[][];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int angle[][] = new int[N][N];

        for(int i = 0 ; i < N ; i ++) Arrays.fill(angle[i], -1);

        for(int i = 0 ; i < N ; i ++){
            for(int j = 0 ; j <= i ; j++){
                int temp = in.nextInt();
                angle[i][j] = temp;
            }
        }
        in.close();
        DP = angle;

        findMaxNum(N-1);
    }
    private static void findMaxNum(int N){
        if(N == 0){
            System.out.println(DP[0][0]);
            return;
        }
        for(int i = 0 ; i < N ; i ++){
            DP[N-1][i] = Math.max(DP[N-1][i] + DP[N][i+1] , DP[N-1][i] + DP[N][i]);
        }
        findMaxNum(N-1);
    }
}


// 0
// 0 1
// 0 1 2
// 0 1 2 3