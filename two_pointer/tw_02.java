package two_pointer;

import java.util.Scanner;
class tw_02 {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            c[i] = str.charAt(i);
        }
        reverseString(c);
        for(int i = 0; i < n; i++) {
            System.out.print(c[i]);
        }
    }
}
