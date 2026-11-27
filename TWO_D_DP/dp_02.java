package TWO_D_DP;

import java.util.Scanner;
class dp_02 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1){
            return 0;
        }
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                dp[i][j] = -1;
            }
        }
        return solve(obstacleGrid, 0, 0, dp);
    }
    public static int solve(int[][] nums, int i, int j, int[][] dp){
        if(i >= nums.length || j >= nums[0].length){
            return 0;
        }
        if(nums[i][j] == 1){
            return 0;
        }
        if(i == nums.length-1 && j == nums[0].length-1){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int down =  solve(nums, i+1, j, dp);
        int right = solve(nums, i, j+1, dp);
        dp[i][j] = down+right;
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
        System.out.println(uniquePathsWithObstacles(nums));
        sc.close();
    }
}
