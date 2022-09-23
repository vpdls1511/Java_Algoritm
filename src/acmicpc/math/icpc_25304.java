package acmicpc.math;

import java.util.Scanner;

public class icpc_25304 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int first_money = in.nextInt();
        int loop = in.nextInt();
        int sum = 0;

        for(int i = 0 ; i < loop ; i++){
            int money = in.nextInt();
            int cnt = in.nextInt();
            sum += money * cnt;
        }

        if(first_money == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
