package sliding_window;


import java.util.Scanner;
class sw_11 {
    public static int minSubArrayLen(int target, int[] nums) {
        int st = 0;
        int e = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(e < nums.length){
            sum += nums[e];
            while(sum >= target){
                min = Math.min(min, e-st+1);
                sum -= nums[st];
                st++;
            }
            e++;
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(minSubArrayLen(target, nums));
        sc.close();
    }
}