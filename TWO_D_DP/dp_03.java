package TWO_D_DP;

import java.util.Scanner;

class dp_03 {
    public static int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                dp[i][j] = -1;
            }
        }
        return solve(grid, 0, 0, dp);
    }
    public static int solve(int[][] nums, int i, int j, int[][] dp){
        if(i >= nums.length || j >= nums[0].length){
            return (int)1e9;
        }
        if(i == nums.length-1 && j == nums[0].length-1){
            return nums[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int right = nums[i][j]+solve(nums, i, j+1, dp);
        int down = nums[i][j]+solve(nums, i+1, j, dp);
        dp[i][j] = Math.min(right, down);
        return dp[i][j];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] nums = new int[m][n];
        System.out.print("Enter "+m*n+" elements: ");
        for(int i = 0;  i < m; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println(minPathSum(nums));
        sc.close();
    }
}