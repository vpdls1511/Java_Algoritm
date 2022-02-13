package acmicpc.math;

import java.util.Scanner;

public class icpc_1011 {
    public static void main ( String[] args ){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0 ; i < N ; i++){
            solution(in.nextInt() , in.nextInt());
        }
    }

    static void solution(int x, int y){
        int distance = y - x;
        int k = 0;
        while(true){
            k++;
            if(distance - k*k <= 0) break;
        }
        if(distance - k*k == 0) System.out.println(k * 2 -1);
        else{
            k = k - 1;
            if(distance - k * k <= k) System.out.println(k*2);
            else System.out.println(k * 2 + 1);
        }
    }
}