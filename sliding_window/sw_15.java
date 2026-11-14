package sliding_window;

import java.util.HashMap;
import java.util.Scanner;
public class sw_15 {
    public static int totalElements(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int st = 0;
        int e = 0;
        int maxLen = 0;
        while(e < nums.length){
            map.put(nums[e], map.getOrDefault(nums[e], 0)+1);
            while(map.size() > 2){
                map.put(nums[st], map.get(nums[st])-1);
                if(map.get(nums[st]) == 0){
                    map.remove(nums[st]);
                }
                st++;
            }
            maxLen = Math.max(maxLen, e-st+1);
            e++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(totalElements(nums));
        sc.close();
    }
}
