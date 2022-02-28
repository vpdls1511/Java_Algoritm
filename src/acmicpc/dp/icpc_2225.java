package acmicpc.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class icpc_2225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] DP = new int[201][201];

        for(int i = 0 ; i <= K ; i++){
            DP[i][0] = 1;
        }

        for(int i = 1 ; i <= K ; i++){
            for(int j = 1 ; j <= N ; j ++){
                DP[i][j] = (DP[i-1][j] + DP[i][j-1]) % 1000000000;
            }
        }

        System.out.println(DP[K][N]);
    }
}
