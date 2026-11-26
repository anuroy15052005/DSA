package ONE_D_DP;

import java.util.Scanner;
class Solution {
    public static boolean canJump(int[] nums) {
        int[] dp = new int[nums.length+1];
        return solve(nums, 0, dp);
    }
    public static boolean solve(int[] nums, int i, int[] dp){
        if(i >= nums.length-1){
            return true;
        }
        if(nums[i] == 0){
            return false;
        }
        if(dp[i] != 0){
            return dp[i]==1;
        }
        for(int jump = 1; jump <= nums[i]; jump++){
            if(solve(nums, i+jump, dp)){
                dp[i] = 1;
                return true;
            }
        }
        dp[i] = -1;
        return false;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(canJump(nums));
        sc.close();
    }
}
