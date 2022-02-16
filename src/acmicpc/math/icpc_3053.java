package acmicpc.math;

import java.util.Scanner;

public class icpc_3053 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int R = in.nextInt();
        in.close();
        System.out.println(R * R * Math.PI);
        System.out.println(2 * R * R);
    }
}
