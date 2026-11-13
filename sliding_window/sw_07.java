package sliding_window;

import java.util.Scanner;
class sw_07 {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int st = 0;
        int e = 0;
        int sum = 0;
        double maxAvg = Double.NEGATIVE_INFINITY;
        while(e < n){
            sum += nums[e];
            while(e-st+1 > k){
                sum -= nums[st];
                st++;
            }
            if(e-st+1 == k){
                maxAvg = Math.max(maxAvg, (double)sum/k);
            }
            e++;
        }
        return maxAvg;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(findMaxAverage(nums, k));
        
    }
}
