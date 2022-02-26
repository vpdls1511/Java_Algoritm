package acmicpc.greedy;

import java.math.BigInteger;
import java.util.Scanner;

public class icpc_1789 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long number = 0;
        long i = 0;
        while(n >= number){
            i++;
            number += i;
        }
        if(n < number) System.out.println(--i);
        else System.out.println(i);
    }
}

//4294967295