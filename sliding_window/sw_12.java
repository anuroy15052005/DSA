package sliding_window;

import java.util.Scanner;

class sw_12{
    public static int longestOnes(int[] nums, int k) {
        int st = 0;
        int e = 0;
        int zero = 0;
        int max = Integer.MIN_VALUE;
        while(e < nums.length){
            if(nums[e] == 0){
                zero++;
            }
            while(zero > k){
                if(nums[st] == 0){
                    zero--;
                }
                st++;
            }
            if(zero <= k){
                max = Math.max(max, e-st+1);
            }
            e++;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(longestOnes(nums, k));
        sc.close();
    }
}
