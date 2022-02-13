package acmicpc.math;

import java.util.Scanner;

public class icpc_2775 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 0 ; i < N ; i++){
            solution(in.nextInt(), in.nextInt());
        }
    }

    static void solution(int k , int n){
        int[][] room = new int [k+1][n+1];
        for(int i = 1 ; i <= n ; i++){
            room[0][i] = i;
        }
        for(int j = 1; j <= k ; j++){
            for(int i = 1 ; i <= n ; i++){
                room[j][i] = room[j][i-1] + room[j-1][i];
            }
        }
        System.out.println(room[k][n]);
    }
}

// 1 3 6 10 15
// 1 2 3 4 5
