package LCS;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;

class lcs_04 {
    public static ArrayList<String> allLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        TreeSet<String> set = new TreeSet<>();
        solve(m, n, "", s1, s2, dp, set);
        return new ArrayList<>(set);
        
    }
    public static void solve(int i, int j, String curr, String s1, String s2, int[][] dp, TreeSet<String> set){
        if(i == 0 || j == 0){
            StringBuilder sb = new StringBuilder(curr);
            set.add(sb.reverse().toString());
            return;
        }
        if(s1.charAt(i-1) == s2.charAt(j-1)){
            solve(i-1, j-1, curr+s1.charAt(i-1), s1, s2, dp, set);
        }else if(dp[i-1][j] > dp[i][j-1]){
            solve(i-1, j, curr, s1, s2, dp, set);
        }else if(dp[i][j-1] > dp[i-1][j]){
            solve(i, j-1, curr, s1, s2, dp, set);
        }else{
            solve(i-1, j, curr, s1, s2, dp, set);
            solve(i, j-1, curr, s1, s2, dp, set);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        ArrayList<String> lst = allLCS(s1, s2);
        System.out.print(lst);
    }
    
}
