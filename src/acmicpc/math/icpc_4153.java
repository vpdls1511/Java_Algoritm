package acmicpc.math;

import java.util.Scanner;

public class icpc_4153 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        long a = 1;
        long b = 1;
        long c = 1;

        while(true){
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            if(a == 0 && b == 0 && c == 0) break;
            a *= a;
            b *= b;
            c *= c;
            if(c == a + b || a == c + b || b == a + c) System.out.println("right");
            else System.out.println("wrong");
        }
        in.close();

    }
}
