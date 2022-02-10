package acmicpc.math;

import java.util.Scanner;

public class icpc_1978 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int count = 0;

        for(int i = 0 ; i < N ; i++){
            int cnt = in.nextInt();
            count += cnt(cnt);
        }

        System.out.println(count);
    }

    public static int cnt (int num) {
        if(num == 1) return 0;
        for(int i = 2 ; i < num ; i++){
            if(num % i == 0) return 0;
        }

        return 1;
    }
}
