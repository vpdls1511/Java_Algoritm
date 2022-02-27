package acmicpc.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class icpc_2293 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[][] dp = new int[n+1][k+1];

        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        dp[1][0] = arr[1];

        for(int coin = 1 ; coin <= n ; coin++){
            for(int value = coin ; value <= k ; value++){
                dp[coin][value] =  dp[coin][value - coin] + dp[coin-1][value];
            }
        }

        System.out.println(dp[n][k]);
    }
}
