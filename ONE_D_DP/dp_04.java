package ONE_D_DP;


import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= 1; i++){
            ans = Math.min(ans, solve(cost, i, dp));
        }
        return ans;
    }
    public static int solve(int[] cost, int i, int[] dp){
        if(i >= cost.length){
            return 0;
        }
        if(i == cost.length-1){
            return cost[i];
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int oneStep = cost[i]+solve(cost, i+1, dp);
        int twoStep = cost[i]+solve(cost, i+2, dp);
  
        dp[i] = Math.min(oneStep, twoStep);
        return dp[i];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n];
        for(int i = 0; i < n; i++){
            cost[i] = sc.nextInt();
        }
        System.out.print(minCostClimbingStairs(cost));
        sc.close();
    }
}