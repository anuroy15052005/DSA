package ONE_D_DP;

import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public static int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(nums, 0, dp);
    }
    public static int solve(int[] nums, int i, int[] dp){
        if(i == nums.length-1){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int minJump = Integer.MAX_VALUE;
        for(int jump = 1; jump <= nums[i]; jump++){
            int nextInd = i + jump;
            if(nextInd < nums.length){
                int step = solve(nums, nextInd, dp);
                if(step != Integer.MAX_VALUE){
                    minJump = Math.min(minJump, step+1);
                }
            }
        }
        dp[i] = minJump;
        return dp[i];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(jump(nums));
        sc.close();
    }
}
