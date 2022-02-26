package acmicpc.greedy;

import java.util.Scanner;

public class icpc_5585 {
    static int[] money = {500, 100, 50, 10, 5 ,1};

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = 1000 - in.nextInt();
        int cnt = 0;
        int mCount = 0;
        while(N != 0){
            if(N >= money[cnt]){
                N = N - money[cnt];
                mCount ++;
            }else {
                cnt++;
            }
        }

        System.out.println(mCount);
    }
}
