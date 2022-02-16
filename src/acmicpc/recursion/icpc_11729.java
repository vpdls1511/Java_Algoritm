package acmicpc.recursion;

import java.util.Scanner;

public class icpc_11729 {

    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        sb.append((int) Math.pow(2,N)-1).append("\n");

        hanoi(N , 1,2,3);
        System.out.print(sb);
    }

    private static void hanoi(int n , int start, int mid, int to){
        //
        // 2
        // 3   1
        // 1 2 3
        if(n == 1){
            sb.append(start+" " + to+"\n");
            return ;
        }
        hanoi(n-1 , start, to, mid);
        sb.append(start+" "+to +"\n");
        hanoi(n-1 , mid, start, to);
    }
}
