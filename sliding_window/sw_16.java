package sliding_window;

import java.util.HashMap;
import java.util.Scanner;
public class sw_16 {
    public static int longestKSubstr(String s, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int st = 0;
        int e = 0;
        int maxLen = -1;
        while(e < s.length()){
            char c = s.charAt(e);
            map.put(c, map.getOrDefault(c, 0)+1);
            while(map.size() > k){
                char ch = s.charAt(st);
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
                st++;
            }
            if(map.size() == k){
                maxLen = Math.max(maxLen, e-st+1);
            }
            e++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.print(longestKSubstr(s, k));
        sc.close();
    }
}
