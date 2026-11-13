package sliding_window;

import java.util.Scanner;

class sw_03 {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        leftSum[0] = nums[0];
        for(int i = 1; i < n; i++){
            leftSum[i] = leftSum[i-1]+nums[i];
        }

        rightSum[n-1] = nums[n-1];
        for(int i = n-2; i >= 0;  i--){
            rightSum[i] = rightSum[i+1]+nums[i];
        }

        for(int i = 0; i < n; i++){
            ans[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int[] ans = leftRightDifference(nums);
        
        for(int x : ans){
            System.out.print(x+" ");
        }
    }
}
