package acmicpc.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class icpc_1339 {

    static int charNum[] = new int[26];
    static int maxInt = 9;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] wordNum = new String[N];

        int result = 0;
        for(int i = 0 ; i < N ; i ++){
            wordNum[i] = in.next();
        }

        for(int i = 0 ; i < N ; i ++){
            int temp = (int)Math.pow( 10 , wordNum[i].length()-1 );
            for(int j = 0 ; j < wordNum[i].length() ; j++){
                charNum[(int) wordNum[i].charAt(j) - 65] += temp;
                temp /= 10;
            }
        }

        Arrays.sort(charNum);

        for(int i = charNum.length-1 ; i >= 0 ; i --){
            if(charNum[i] == 0) break;
            result += charNum[i] * maxInt;
            maxInt--;
        }

        System.out.println(result);

    }
}
