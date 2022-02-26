package acmicpc.greedy;

import java.util.Scanner;

public class icpc_2839 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        my(in.nextInt());
    }

    private static void my(int n){
        // 3kg or 5kg.
        int bag = 0;
        int value = n;
        bag = n/5;
        n = n%5;
        while(n % 3 != 0){
            n += 5;
            bag -= 1;
            if(n > value ){
                System.out.println(-1);
                return;
            }
        }

        bag += n/3;
        System.out.println(bag);

    }
}
