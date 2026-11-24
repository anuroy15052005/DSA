package ONE_D_DP;


import java.util.Arrays;
import java.util.Scanner;
class dp_05 {
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            ans = Math.max(ans, solve(nums, i, dp));
        }
        return ans;
    }
    public static int solve(int[] nums, int i, int[] dp){
        if(i >= nums.length){
            return 0;
        }
        if(i == nums.length-1){
            return nums[i];
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int twoStep = Integer.MIN_VALUE;
        if(i <= nums.length-2){
            twoStep = nums[i] + solve(nums, i+2, dp);
        }
        int threeStep = Integer.MIN_VALUE;
        if(i <= nums.length-3){
            threeStep = nums[i]+solve(nums, i+3, dp);
        }
        dp[i] = Math.max(twoStep, threeStep);
        return dp[i];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(rob(nums));
        sc.close();
    }
}
