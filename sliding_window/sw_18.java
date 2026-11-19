package sliding_window;

import java.util.Scanner;
import java.util.HashMap;
class sw_18 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if(n < 2){
            return false;
        }
        int[] prefixSum = new int[n];
        prefixSum[0]  = nums[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);
        for(int i = 0; i < n; i++){
            long rem;
            if(k == 0){
                rem = prefixSum[i];
            }else{
                rem = ((prefixSum[i]%k)+Math.abs((long)k))%Math.abs((long)k);
            }
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                if(len >= 2){
                    return true;
                }
            }else{
                map.put(rem, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(checkSubarraySum(nums, k));
        sc.close();
    }
}
