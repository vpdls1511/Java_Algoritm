package acmicpc.math;

import java.util.Scanner;

public class icpc_9020 {
    static boolean prime[];
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for(int i = 0 ; i < T ; i ++){
            solution(in.nextInt());
        }

    }

    static void solution(int n) {
        setPrime(n);
        int num[] = new int[2];
        num[0] = 1;
        num[1] = 10000;
        for(int i = 0 ; i <= n ; i ++){
            if(!prime[i]){
                int j = n - i;
                if(!prime[j]){
                    //System.out.println(j + " " + i);
                    if(Math.abs(num[1] - num[0]) > Math.abs(j - i)){
                        num[0] = i;
                        num[1] = j;
                    }
                }
            }
        }

        System.out.println(num[0] + " " + num[1]);
    }

    static void setPrime(int n){
        prime = new boolean[n+1];

        prime[0] = true;
        prime[1] = true;

        for(int i = 0 ; i < Math.sqrt(prime.length);i++){
            if(prime[i]) continue;
            for(int j = i * i ; j < prime.length ; j += i){
                prime[j] = true;
            }
        }
    }
}