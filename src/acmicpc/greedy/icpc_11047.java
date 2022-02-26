package acmicpc.greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class icpc_11047 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int cnt = -1;
        int money = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            arr.add(in.nextInt());

        }
        for(int i = 0 ; i < N ; i++){
            if(K < arr.get(i).intValue()){
                cnt = i;
                break;
            }
        }
        if( cnt == -1) cnt = N - 1;
        while( K != 0){
            if( K >= arr.get(cnt).intValue()){
                K = Math.abs(K - arr.get(cnt).intValue());
                ++money;
            }else{
                cnt--;
            }
        }

        System.out.println(money);
    }
}
