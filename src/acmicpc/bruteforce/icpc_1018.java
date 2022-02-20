package acmicpc.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class icpc_1018 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int count = 10000000;
        int[] cnt = new int[2]; // 0 = B , 1 = W
        char[][] chess = new char[M][N];

        for(int i = 0 ; i < M ; i ++){
            String str = in.next();
            for(int j = 0 ; j < str.length() ; j ++){
                chess[i][j] = str.charAt(j);
            }
        }

        for(int i = 0 ; i < M - 7 ; i++){ // 8*8 사이즈의 사각형이 몇개인지 구하는 루프
            for(int j = 0 ; j < N - 7 ; j ++){
                cnt[0] = 0;
                cnt[1] = 0;
                for(int a = i ; a < i+8 ; a++){ // i,j 부터 (i+7 , j+7) 까지 즉, 8*8 크기의 사각형 탐색
                    for(int b = j ; b < j+8 ; b++){
                        if((a+b) % 2 == 0){
                            if(chess[a][b] != 'W') cnt[0] += 1;
                            if(chess[a][b] != 'B') cnt[1] += 1;
                        }else{
                            if(chess[a][b] != 'B') cnt[0] += 1;
                            if(chess[a][b] != 'W') cnt[1] += 1;
                        }
                    }
                }
                count = Math.min(Math.min(cnt[0] , cnt[1]) , count);
            }
        }
        System.out.println(count);

    }
}
