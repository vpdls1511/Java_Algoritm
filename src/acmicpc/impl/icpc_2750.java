package acmicpc.impl;

import java.util.Scanner;

public class icpc_2750 {
    public static int[] arr = new int[1000];

    public static void main ( String[] args ){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for(int i = 0 ; i < N ; i++ ){
            arr[i] = in.nextInt();
        }
        sort_solution(N);
    }

    public static void sort_solution(int N){
        for(int i=0 ; i<N ;i++){
            for(int j = 0 ; j < N ; j ++){
                if(arr[i] < arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < N ; i++){
            System.out.println(arr[i]);
        }
    }
}
