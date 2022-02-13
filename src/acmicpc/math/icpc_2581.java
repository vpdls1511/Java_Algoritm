package acmicpc.math;

import java.util.Scanner;

public class icpc_2581 {
    public static boolean[] primeArr;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();
        int sum = 0;
        int min = -1;

        primeArr = new boolean[N+1];
        prime();

        for(int i = M ; N >= i ; i++){
           if(primeArr[i] == false){
               if(min == -1) min = i;
               sum += i;
           }
        }

        if(sum == 0) {
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }

    static void prime(){
        primeArr[0] = true;
        primeArr[1] = true;
        for(int i = 2 ; i < Math.sqrt(primeArr.length) ; i++){
            for(int j = i * i ; j < primeArr.length ; j += i){
               primeArr[j] = true;
            }
        }
    }
}
