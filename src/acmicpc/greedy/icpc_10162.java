package acmicpc.greedy;

import java.util.Scanner;

public class icpc_10162 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count[] = {0, 0, 0};

        int aTime = 60*5;
        int bTime = 60;
        int cTime = 10;

        if(N % 10 != 0){
            System.out.println(-1);
            return;
        }

        while(N != 0){
            if(N >= aTime){
                N -= aTime;
                count[0]++;
            }else if(N >= bTime){
                N -= bTime;
                count[1]++;
            }else if(N >= cTime){
                N -= cTime;
                count[2]++;
            }
        }

        System.out.println(count[0] + " " + count[1] + " " + count[2]);
    }
}
