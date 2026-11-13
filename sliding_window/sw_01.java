package sliding_window;

import java.util.Scanner;
public class sw_01 {
    public static int[] solve(int[] nums){
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            arr[i] = arr[i-1]+nums[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = solve(nums);
        for(int x: ans){
            System.out.print(x+" ");
        }
        sc.close();
    }
}
