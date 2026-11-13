package sliding_window;

import java.util.Scanner;
class sw_06 {
    public static int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length+1];
        ans[0] = 0;
        for(int i = 1; i < ans.length; i++){
            ans[i] = ans[i-1] + gain[i-1];
        }
        int max = Integer.MIN_VALUE;
        for(int x: ans){
            max = Math.max(max, x);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(largestAltitude(nums));
    }
}
