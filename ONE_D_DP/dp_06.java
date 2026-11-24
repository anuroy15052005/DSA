package ONE_D_DP;

import java.util.Arrays;
import java.util.Scanner;
class dp_06 {
    public static int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp1 = new int[nums.length];
        Arrays.fill(dp1, -1);
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp2, -1);
        int ans1 = solve(nums, 0, nums.length-1, dp1);
        int ans2 = solve(nums, 1, nums.length, dp2);
        int ans = Math.max(ans1, ans2);
        return ans;
    }
    public static int solve(int[] nums, int i, int n, int[] dp){
        if(i >= n){
            return 0;
        }
        if(i == n-1){
            return nums[i];
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob = nums[i] + solve(nums, i+2, n, dp);
        int notrob = solve(nums, i+1, n, dp);
        dp[i] = Math.max(rob, notrob);
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
