package acmicpc.math;

import java.util.Scanner;

public class icpc_1002 {

    static int x1 = 0 , y1 = 1 , r1 = 2;
    static int x2 = 3 , y2 = 4 , r2 = 5;
    static int[] turret = new int[6];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int cnt = 0;
        while(cnt < N){
            cnt++;
            double dist = 0;

            turret[x1] = in.nextInt();
            turret[y1] = in.nextInt();
            turret[r1] = in.nextInt();
            turret[x2] = in.nextInt();
            turret[y2] = in.nextInt();
            turret[r2] = in.nextInt();

            if(turret[x1] == turret[x2] && turret[y1] == turret[y2]){
                if(turret[r1] == turret[r2]){
                    System.out.println(-1);
                }else{
                    System.out.println(0);
                }
                continue;
            };

            dist = Math.sqrt((Math.pow(turret[x1] - turret[x2] , 2) + Math.pow(turret[y1] - turret[y2] , 2)));

            if(dist < turret[r1] + turret[r2]) System.out.println(2);
            else if(dist == turret[r1] + turret[r2]) System.out.println(1);
            else if(dist > turret[r1] + turret[r2]) System.out.println(0);
        }

    }
}
