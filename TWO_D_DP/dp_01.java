package TWO_D_DP;

import java.util.Scanner;

class Solution {
    public static int uniquePaths(int m, int n){
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                dp[i][j] = -1;
            }
        }
        return solve(m, n, 0, 0, dp);
    }
    public static int solve(int m, int n, int i, int j, int[][] dp){
        if(i > n && j > n){
            return 0;
        }
        if(i == m-1 || j == n-1){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int down = solve(m, n, i+1, j, dp);
        int right = solve(m, n, i, j+1, dp);
        dp[i][j] = down+right;
        return dp[i][j];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(uniquePaths(m, n));
        sc.close();
    }
}