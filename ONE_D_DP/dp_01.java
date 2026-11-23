package ONE_D_DP;

import java.util.Scanner;
class dp_01 {
    public static int fib(int n) {
        int[] dp = new int[n+1];
        for(int i = 0; i <= n; i++){
            dp[i] = -1;
        }
        return solve(n, dp);
    }
    public static int solve(int n, int[] dp){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = solve(n-1, dp)+solve(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fib(n));
        sc.close();
    }
    
}
