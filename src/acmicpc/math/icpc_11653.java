package acmicpc.math;

import java.util.Scanner;

public class icpc_11653 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 1;
        while(N != 1){
            i++;
            if(N%i == 0){
                N = N/i;
                System.out.println(i);
                i = 1;
            }
        }
    }
}
