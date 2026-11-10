package maths;

import java.util.Scanner;
class math_02{
    public static int solve(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solve(n));
    }
}
