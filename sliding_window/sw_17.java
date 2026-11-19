package sliding_window;

import java.util.Scanner;
import java.util.HashMap;
class sw_17 {
    public static int solve(int[] nums, int k){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        map.put(0, 1);
        int count = 0;
        for(int num : prefixSum){
            int rem = ((num%k)+k)%k;
            count += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(solve(nums, k));
        sc.close();
    }
}
