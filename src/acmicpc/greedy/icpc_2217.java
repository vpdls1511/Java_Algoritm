package acmicpc.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class icpc_2217 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K[] = new int[N];

        for(int i = 0 ; i < N ; i ++){
            K[i] = in.nextInt();
        }

        Arrays.sort(K);
        int max = 0;
        for(int i = 0 ; i < N ; i++){
            max = Math.max(K[i] * (N-i), max);
        }

        System.out.println(max);
    }
}
