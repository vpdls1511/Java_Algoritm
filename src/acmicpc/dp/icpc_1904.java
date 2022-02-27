package acmicpc.dp;

import java.util.Scanner;

public class icpc_1904 {

    // 1
    // 1

    // 2
    // 11 00

    // 3
    // 001 100 111

    // 4
    // 0011 1100 1001 1111 0000

    // 5
    // 00111 10011 11001 11100 11111

    static long[] DP = new long[1000001];


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        DP[0] = 0;
        DP[1] = 1;
        DP[2] = 2;

        if(k < 3){
            System.out.println(DP[k]);
        }else{
            System.out.println(solution(k));
        }
    }

    private static long solution(int i){

        int v1 = 1;
        int v2 = 2;
        int sum = 0;

        for(int k = 3 ; k <= i ; k++){
            sum = (v1 + v2) % 15746;
            v1 = v2;
            v2 = sum;
        }
        return sum;
    }
}
