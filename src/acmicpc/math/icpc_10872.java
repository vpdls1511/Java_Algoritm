package acmicpc.math;

import java.util.Scanner;

public class icpc_10872 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println(factorial(in.nextInt()));
    }

    public static int factorial(int num){
        if(num <= 1) return 1;

        return num * factorial(num-1);
    }
}
