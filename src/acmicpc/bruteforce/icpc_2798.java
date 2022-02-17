package acmicpc.bruteforce;

import java.util.Scanner;

public class icpc_2798 {
    static int N = 0;
    static int M = 1;
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int[] condition = new int[2];
        condition[N] = in.nextInt();
        condition[M] = in.nextInt();
        int[] arr = new int[condition[N]];
        int result = 0;

        for(int i = 0 ; i < condition[N] ; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        for(int i = 0 ; i < condition[N]-2 ; i++){
            for(int j = i+1 ; j < condition[N]-1 ; j++){
                for(int k = j+1 ; k < condition[N] ; k++){
                    int temp = arr[i] + arr[j] + arr[k];
                    if(temp == condition[M]){
                        System.out.println(temp);
                        return;
                    }
                    if(result < temp && temp < condition[M]){
                        result = temp;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
