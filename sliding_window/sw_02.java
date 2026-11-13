package sliding_window;

import java.util.Scanner;
class sw_02 {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        
        int[] sumLeft = new int[n];
        int[] sumRight = new int[n];

        sumLeft[0] = nums[0];
        for(int i = 1; i < n; i++){
            sumLeft[i] = sumLeft[i-1]+nums[i];
        }

        sumRight[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            sumRight[i] = sumRight[i+1]+nums[i];
        }

        for(int i = 0; i < n; i++){
            if(sumLeft[i] == sumRight[i]){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i]  = sc.nextInt();
        }
        System.out.print(pivotIndex(nums));
        
    }
}
