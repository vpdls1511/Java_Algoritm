package acmicpc.math;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class icpc_4948 {
    static boolean prime[];

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        while (N != 0){
            setPrime(N);
            int count = 0;
            for(int i = N+1 ; i <= N*2 ; i++){
                if(!prime[i]) {
                    //System.out.println(i);
                    count++;
                }
            }
            System.out.println(count);
            N = in.nextInt();
        }
    }

    public static void setPrime(int N) {
        prime = new boolean[(N*2)+1];

        prime[0] = true;
        prime[1] = true;

        for(int i = 2 ; i < Math.sqrt(prime.length) ; i++){
            if(prime[i]) continue;
            for(int j = i * i ; j < prime.length ; j += i){
                prime[j] = true;
            }
        }
    }
}
