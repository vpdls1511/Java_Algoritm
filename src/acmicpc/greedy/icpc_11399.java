package acmicpc.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class icpc_11399 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int p[] = new int[N];
        int result = 0;
        for( int i = 0 ; i < N ; i ++ ){
            p[i] = in.nextInt();
        }
        Arrays.sort(p);

        result += p[0];
        for(int i = 1 ; i < N ; i++){
            p[i] = p[i] + p[i-1];
            result += p[i];
        }

        System.out.println(result);
    }
}
