package acmicpc.bruteforce;

import java.util.Scanner;

public class icpc_2231 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int cnt = 1;
        while(cnt <= 1000000) {
            int result = 0;
            String str = Integer.toString(cnt);
            //char[] arr = new char[str.length()];
            for(int i = 0 ; i < str.length() ; i ++){
                result += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            if(result+cnt == N) {
                System.out.println(cnt);
                return;
            }
            cnt++;
        }
        System.out.println(0);

    }
}
