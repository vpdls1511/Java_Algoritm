package acmicpc.bruteforce;

import java.util.Scanner;

public class icpc_7568 {
    static int size[];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[][] = new int[N][2];
        int cnt = 1;
        size  = new int[N];
        for (int i = 0 ; i < N ; i++){
            arr[i][0] = in.nextInt(); // 몸무게
            arr[i][1] = in.nextInt(); // 키
        }

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j ++){
                if(j == i) continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    cnt++;
                }
            }
            size[i] = cnt;
            cnt = 1;
            System.out.println(size[i]);
        }
    }
}
