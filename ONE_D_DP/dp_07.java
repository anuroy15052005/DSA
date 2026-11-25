package ONE_D_DP;

import java.util.HashMap;
import java.util.Scanner;
class dp_07 {
    public static int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = -1;
        for(int x: map.keySet()){
            if(x > max){
                max = x;
            }
        }
        int[] points = new int[max+1];
        for(int x: map.keySet()){
            points[x] = x*map.get(x);
        }
        int[] dp = new int[max+1];
        dp[0] = points[0];
        dp[1] = Math.max(points[0], points[1]);
        for(int i = 2; i <= max; i++){
            dp[i] = Math.max(dp[i-1], points[i]+dp[i-2]);
        }
        return dp[max];

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(deleteAndEarn(nums));
        sc.close();
    }
}
