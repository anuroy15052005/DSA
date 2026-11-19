package LCS;

import java.util.Scanner;
class lcs_02 {
    public boolean isSubsequence(String s, String t) {
        return solve(s, t, 0, 0);
    }
    public boolean solve(String s, String t, int i, int j){
        if(i == s.length()){
            return true;
        }
        if(j == t.length()){
            return false;
        }
        if(s.charAt(i) == t.charAt(j)){
            return solve(s, t, i+1, j+1);
        }
        return solve(s, t, i, j+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        lcs_02 obj = new lcs_02();
        boolean ans = obj.isSubsequence(text1, text2);
        System.out.print(ans);
        sc.close();
    }
}
