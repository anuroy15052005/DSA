package ONE_D_DP;

import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static int countWays(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
    public static int solve(int n, int[] dp){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        if(n == 4){
            return 4;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = solve(n-1, dp)+solve(n-3, dp)+solve(n-4, dp);
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countWays(n));
        sc.close();
    }
}
