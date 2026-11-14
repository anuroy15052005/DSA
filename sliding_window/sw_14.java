package sliding_window;

import java.util.Scanner;
import java.util.HashSet;
class sw_14 {
    public static int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int st = 0;
        int e = 0;
        int sum = 0;
        int maxSum = 0;
        while(e < nums.length){
            while(set.contains(nums[e])){
                sum -= nums[st];
                set.remove(nums[st]);
                st++;
            }
            set.add(nums[e]);
            sum += nums[e];
            maxSum = Math.max(sum, maxSum);
            e++;

        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(maximumUniqueSubarray(nums));
        sc.close();
    }
}
