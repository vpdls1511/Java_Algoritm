package acmicpc.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class icpc_11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] price = new int[N + 1];
        int[] DP = new int[N+1];
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1 ; i <= N ; i++){ // 1개 부터 N개 까지 구매할 경우를 구한다.
            for(int j = 1 ; j <= i ; j++){
                DP[i] = Math.max(DP[i] , price[j] + DP[i - j]);
            }

        }

        System.out.println(DP[N]);

    }
}


// 1 / 10