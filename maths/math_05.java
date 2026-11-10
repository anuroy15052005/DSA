package maths;

import java.util.Scanner;
public class math_05 {
	public static boolean solve(int n){
        int num = n;
		int arm = 0;
        int count = 0;
        while(n > 0){
            count++;
            n = n/10;
        }
        n = num;
		while(n > 0){
			int r = n %10;
            int power = 1;
            for(int i = 0; i < count; i++){
                power *= r;
            }
            arm += power;
            n = n/10;
		}
		if(arm == num){
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
