package acmicpc.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class icpc_1026 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];

        for(int i = 0 ; i < N ; i ++){
            A[i] = in.nextInt();
        }
        for(int i = 0 ; i < N ; i ++){
            B[i] = in.nextInt();
        }

        in.close();

        Arrays.sort(A);
        Arrays.sort(B);
        int result = 0;
        for(int i = 0 ; i < N ; i++){
            result += A[i] * B[N - 1 - i];
        }

        System.out.println(result);

    }
}
