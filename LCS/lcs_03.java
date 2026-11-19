package LCS;

import java.util.Scanner;
public class lcs_03 {
    public static String findLCS(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        String[][] dp = new String[m][n];
        return solve(s1, s2, 0, 0, dp);
    }
    public static String solve(String s1, String s2, int i, int j, String[][] dp){
        if(i == s1.length() || j == s2.length()){
            return "";
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return s1.charAt(i)+solve(s1, s2, i+1, j+1, dp);
        }
        String first = solve(s1, s2, i+1, j, dp);
        String second = solve(s1, s2, i, j+1, dp);
        if(first.length() > second.length()){
            dp[i][j] = first;
            return dp[i][j];
        }else{
            dp[i][j] = second;
            return dp[i][j];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        System.out.print(findLCS(text1, text2));
        sc.close();
    }
}
