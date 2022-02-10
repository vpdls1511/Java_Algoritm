package acmicpc.dp;

import java.util.Arrays;
import java.util.Scanner;

public class icpc_11053 {
    public static void main (String[] args) {

        int[] DP = new int[1001];

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 1 ; i<=N ; i++){
            DP[i] = in.nextInt();
        }

        solution(DP, N);
    }
    public static void solution(int[] arr, int N){
        int[] DP = new int[1001];

        for(int i = 1 ; i <= N ; i++){
            DP[i] = 1;
            for(int j = 1 ; j < i ; j ++) {
                if(arr[j] < arr[i]){
                    DP[i] = Math.max(DP[j] + 1 , DP[i]);
                }
            }
        }

        System.out.println(Arrays.stream(DP).max().getAsInt());

    }
}