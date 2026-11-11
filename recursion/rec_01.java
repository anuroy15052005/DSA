package recursion;

import java.util.Scanner;
import java.util.HashSet;
class rec_01 {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int st = 0;
        int e = 0;
        int max = 0;
        while(e < s.length()){
            char c = s.charAt(e);
            while(set.contains(c)){
                set.remove(s.charAt(st));
                st++;
            }
            set.add(c);
            max = Math.max(max, e-st+1);
            e++;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(lengthOfLongestSubstring(s));
    }
}
