package acmicpc.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class icpc_11057 {

    static long[][] DP;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        DP = new long[N+1][10];

        for(int i = 0 ; i < 10 ; i ++){DP[0][i] = 1;}

        for(int i = 1 ; i < N+1 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                if(j > 0){
                    DP[i][j] = DP[i - 1][j] + DP[i][j-1];
                }else{
                    DP[i][j] = DP[i - 1][j];
                }
                DP[i][j] %= 10007;
            }
        }

        System.out.println(DP[N][9]);

    }
}
