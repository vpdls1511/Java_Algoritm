package acmicpc.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class icpc_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(in.nextToken());
        int B = Integer.parseInt(in.nextToken());
        int V = Integer.parseInt(in.nextToken());

        System.out.println(solution(A,B,V));
    }
    public static int solution(int A, int B, int V) {
        int result = (V-B) / (A-B);
        if((V-B) % (A-B) > 0){
            result++;
        }
        return result;
    }
}
