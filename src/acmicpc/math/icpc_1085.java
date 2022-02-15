package acmicpc.math;

import java.util.Scanner;

public class icpc_1085 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        solution(x,y,w,h);
    }

    static void solution(int x, int y , int w, int h) {
        int right = w - x;
        int left = x;
        int top = h - y;
        int bottom = y;

        int min = 0;
        min = Math.min(right,left);
        min = Math.min(min,top);
        min = Math.min(min,bottom);

        System.out.println(min);
    }
}
