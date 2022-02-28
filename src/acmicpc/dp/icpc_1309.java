package acmicpc.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class icpc_1309 {

    static long[][] DP;

    static int blank = 0;
    static int left = 1;
    static int right = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        DP = new long[N+1][3];

        DP[1][blank] = 1;
        DP[1][left] = 1;
        DP[1][right] = 1;

        for(int i = 2 ; i <= N ; i++){
            DP[i][blank] = (DP[i-1][blank] + DP[i-1][left] + DP[i-1][right])%9901;
            DP[i][left] = (DP[i-1][blank] + DP[i-1][right]) % 9901;
            DP[i][right] = (DP[i-1][blank] + DP[i-1][left]) % 9901;
        }
        System.out.println((DP[N][blank] + DP[N][left] + DP[N][right]) % 9901);

    }
}
