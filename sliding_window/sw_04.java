package sliding_window;

import java.util.Scanner;
class sw_04 {
    public static int minStartValue(int[] nums) {
        int n = nums.length;

        int[] leftSum = new int[n+1];

        leftSum[0] = 0;
        for(int i = 1; i < leftSum.length; i++){
            leftSum[i] = leftSum[i-1]+nums[i-1];
        }
        
        int min = Integer.MAX_VALUE;
        for(int x: leftSum){
            min = Math.min(min, x);
        }
        return 1- min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(minStartValue(nums));
    }
}