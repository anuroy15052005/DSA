package sliding_window;

import java.util.Arrays;
import java.util.Scanner;
public class sw_09 {
    public static boolean checkInclusion(String s1, String s2){
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        int k = s1.length();
        for(int i = 0; i < k; i++){
            char c = s1.charAt(i);
            count1[c-'a']++;
        }

        int st = 0;
        int e = 0;
        while(e < s2.length()){
            char c = s2.charAt(e);
            count2[c-'a']++;
            if(e-st+1 > k){
                char ch = s2.charAt(st);
                count2[ch-'a']--;
                st++;
            }
            if(e-st+1 == k){
                if(Arrays.equals(count1, count2)){
                    return true;
                }
            }
            e++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.print(checkInclusion(s1, s2));
        sc.close();
        
    }
}
