package acmicpc.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class icpc_10610 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String N = in.next();
        char[] str = N.toCharArray();

        if(str[0] == '0') {
            System.out.println(-1);
            return;
        }
        Arrays.sort(str);

        if(str[0] != '0') {
            System.out.println(-1);
            return;
        }

        int result = 0;
        for(int i = 0 ; i < str.length ; i++){
            result += Integer.parseInt(String.valueOf(str[i]));
        }

        if(result % 3 == 0){
            for(int i = 0 ; i < str.length/2 ; i++){
                char temp = str[i];
                str[i] = str[str.length - 1 - i];
                str[str.length - 1 - i] = temp;
            }
            System.out.println(new String(str));
        }else{
            System.out.println(-1);
        }
    }
}
