package maths;

import java.util.Scanner;
public class math_06 {
    public static boolean solve(int n){
        int count = 0;
        for(int i = 1; i * i <= n; i++){
            if(n%i == 0){
                count++;
                if(n/i != i){
                    count++;
                }
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solve(n));
    }

}
