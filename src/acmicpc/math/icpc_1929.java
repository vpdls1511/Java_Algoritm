package acmicpc.math;

import java.util.Scanner;

public class icpc_1929 {

    static boolean prime[];

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();

        setPrime(N);

        for(int i = M ; i <= N ; i++){
            if(!prime[i]) System.out.println(i);
        }

    }

    static void setPrime(int N){
        prime = new boolean[N+1];

        prime[0] = true;
        prime[1] = true;

        for(int i = 2 ; i < Math.sqrt(prime.length) ; i ++){
            for(int j = i * i ; j < prime.length ; j += i ){
                prime[j] = true;
            }
        }
    }
}
