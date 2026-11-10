package two_pointer;

import java.util.Scanner;
class tw_01 {
    public static boolean isPalindrome(String s) {
        String st = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c = (char)(c+32);
                st += c;
            }
            else if(c >= 'a' && c <= 'z'){
                st += c;
            }
            else if(c >= '0' && c <= '9'){
                st += c;
            }
        }
        int n = st.length();
        int i = 0;
        int j = n-1;
        while(i < j){
            if(st.charAt(i) != st.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(isPalindrome(s));
    }
}
