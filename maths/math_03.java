package maths;

import java.util.Scanner;
public class math_03 {
	public static int solve(int n){
		int revNum = 0;
		while(n > 0){
			int r = n%10;
			revNum = (revNum*10)+r;
			n = n/10;
		}
		return revNum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(solve(n));
	}
}

