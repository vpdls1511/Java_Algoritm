package acmicpc.math;

import java.util.Scanner;

public class icpc_3009 {
    static int x = 0 , y = 1;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] square = new int[4][2];

        for(int i = 0 ; i < 3 ; i ++ ){
            square[i][0] = in.nextInt();
            square[i][1] = in.nextInt();
        }
        in.close();

        solution(square);
    }

    private static void solution(int[][] square){
        int x = 0;
        int y = 0;

        if(square[0][0] == square[1][0]) x = square[2][0];
        else if(square[1][0] == square[2][0]) x = square[0][0];
        else if(square[2][0] == square[0][0]) x = square[1][0];

        if(square[0][1] == square[1][1]) y = square[2][1];
        else if(square[1][1] == square[2][1]) y = square[0][1];
        else if(square[2][1] == square[0][1]) y = square[1][1];

        System.out.println(x + " " + y);
    }
}
