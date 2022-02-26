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

    // 다른사람의 풀이
    private static void solution(int n){
        // https://st-lab.tistory.com/72
        if(n == 4 || n == 7){
            System.out.println(-1);
        }else if( n%5 == 0){
            System.out.println(n/5);
        }else if( n%5 == 1 || n%5 == 3){
            System.out.println((n/5) + 1);
        }else if( n%5 == 2 || n%5 == 4){
            System.out.println((n/5) + 2);
        }
    }
}
