package ONE_D_DP;

import java.util.Arrays;
import java.util.Scanner;
class dp_03 {
    public static int minCost(int[] height) {
        int[] dp = new int[height.length+1];
        Arrays.fill(dp, -1);
        return solve(height, 0, dp);
        
    }
    public static int solve(int[] height, int i, int[] dp){
        if(i == height.length-1){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int oneStep = Math.abs(height[i]-height[i+1]) + solve(height, i+1, dp);
        int twoStep = Integer.MAX_VALUE;
        if(i < height.length-2){
            twoStep = Math.abs(height[i]-height[i+2]) + solve(height, i+2, dp);
        }
        dp[i] = Math.min(oneStep, twoStep);
        return dp[i];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        System.out.print(minCost(height));
        sc.close();
    }
}