package acmicpc.dp;

import java.util.*;

public class icpc_11726 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(solution(scan.nextInt()));
    }

    public static int solution(int value){
        int[] DP = new int[value+2];
        DP[0] = 1;
        DP[1] = 1;

        for(int i = 2 ; i <= value ; i++){
            DP[i] = (DP[i-1] + DP[i-2]) % 10007;
        }

        return DP[value];
    }
}