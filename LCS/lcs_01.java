package LCS;

import java.util.Scanner;
class lcs_01 {
    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                dp[i][j] = -1;
            }
        }
        return solve(text1, text2, 0, 0, dp);
    }
    public static int solve(String s1, String s2, int i, int j, int[][] dp){
        if(i == s1.length() || j == s2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return 1+solve(s1, s2, i+1, j+1, dp);
        }
        int first = solve(s1, s2, i+1, j, dp);
        int second = solve(s1, s2, i, j+1, dp);
        dp[i][j] = Math.max(first, second);
        return dp[i][j];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        System.out.print(longestCommonSubsequence(text1, text2));
        sc.close();
    }
}
