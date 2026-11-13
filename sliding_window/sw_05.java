package sliding_window;

import java.util.Scanner;
class sw_05 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for(int i = 0; i < n; i++){
            leftSum[i] = 1;
            rightSum[i] = 1; 
        }
        leftSum[0] = nums[0];
        for(int i = 1; i < n; i++){
            leftSum[i] = leftSum[i-1]*nums[i];
        }

        rightSum[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            rightSum[i] = rightSum[i+1]*nums[i];
        }

        for(int i = 0; i < n; i++){
            if(i == 0){
                ans[i] = rightSum[i+1];
            }
            else if(i == n-1){
                ans[i] = leftSum[i-1];
            }
            else{
                ans[i] = leftSum[i-1]*rightSum[i+1];
            }
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
        int[] ans = productExceptSelf(nums);
        for(int x: ans){
            System.out.print(x+" ");
        }
        sc.close();
    }
}