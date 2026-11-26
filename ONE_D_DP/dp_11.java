package ONE_D_DP;

import java.util.Arrays;
import java.util.Scanner;
class dp_11 {
    public static int derangeCount(int n) {
        int[] dp =  new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
    public static int solve(int n, int[] dp){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = (n-1)*(solve(n-1, dp)+solve(n-2, dp));
        return dp[n];
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(derangeCount(n));
        sc.close();
    }
}
