package maths;

import java.util.Scanner;
public class math_04 {
	public static boolean solve(int n){
        int num = n;
		int revNum = 0;
		while(n > 0){
			int r = n%10;
			revNum = (revNum*10)+r;
			n = n/10;
		}
		if(revNum == num){
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
