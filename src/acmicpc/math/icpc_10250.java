package acmicpc.math;

import java.util.Scanner;

public class icpc_10250 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[][] arr = new int[3][T];
        for (int i = 0 ; i<T;i++){
            arr[0][i] = in.nextInt();
            arr[1][i] = in.nextInt();
            arr[2][i] = in.nextInt();
        }
        for (int i = 0 ; i<T;i++){
            System.out.println(solution(arr[0][i], arr[1][i], arr[2][i]));
        }
    }

    static String solution(int H, int W, int N){
        int no = N % H > 0 ? N / H + 1 : N / H;
        int floor = (N%H == 0 ? H : N%H )* 100;
        return Integer.toString(floor+no);
    }
}
