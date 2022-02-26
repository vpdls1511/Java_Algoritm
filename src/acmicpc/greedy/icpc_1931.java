package acmicpc.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class icpc_1931 {

    static int start = 0 ;
    static int end = 1 ;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[][] = new int[N][2];

        for (int i = 0 ; i < N ; i++){
            arr[i][start] = in.nextInt();
            arr[i][end] = in.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() { // 회의 종료시간 순으로 정렬을 해야한다.
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[end] == o2[end]) return o1[start] - o2[start];
                else return o1[end] - o2[end];
            }
        });

        int cnt = 0;
        int prev_time = 0;
        for(int i = 0 ; i < N ; i++){
            if(prev_time <= arr[i][start]){
                prev_time = arr[i][end];
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
}
