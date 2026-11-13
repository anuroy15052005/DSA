package sliding_window;

import java.util.Scanner;
class sw_08 {
    public static int maxVowels(String s, int k) {
        int n = s.length();
        int max = Integer.MIN_VALUE;
        int curr=0;
        int st = 0;
        int e = 0;
        while(e < n){
            char c = s.charAt(e);
            if(isVowel(c)){
                curr++;
            }
            if(e-st+1 > k){
                char ch = s.charAt(st);
                if(isVowel(ch)){
                    curr--;
                }
                st++;
            }
            if(e-st+1 == k){
                max = Math.max(max, curr);
            }
            e++;
            
        }
        return max;
    }
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.print(maxVowels(s, k));
        sc.close();
    }
}


