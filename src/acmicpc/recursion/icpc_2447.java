package acmicpc.recursion;

import com.sun.tools.jconsole.JConsoleContext;
import com.sun.tools.jconsole.JConsolePlugin;

import java.util.Arrays;
import java.util.Scanner;

public class icpc_2447 {
    // 해설을 5개정도 봣는데 솔직히 이해가 잘 안된다.
    // 다음번에 한번 물어봐야할듯
    static char[][] arr;
    static int count = 0;
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        arr = new char[N][N];

        for(int i = 0 ; i < N ; i++){
            Arrays.fill(arr[i], ' ');
        }

        star(0, 0, N);
        for(int i = 0 ; i < N ; i++){
            System.out.println(arr[i]);
        }
    }
    private static void star(int x , int y, int N){

        if(N == 1){
            arr[x][y] = '*';
            return;
        }
        System.out.println(N);
        int value = N/3;

        for(int i = 0 ; i < 3 ; i ++){
            for(int j = 0 ; j < 3 ; j ++){
                if(i == 1 && j == 1 ) continue;
                else star(x+(value*i) , y+(value*j) , value);
            }
        }
    }
}
