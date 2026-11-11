package recursion;

import java.util.Scanner;
class rec_02 {
    public static int countGoodNumbers(long n) {
        int mod = (int)1e9+7;
        long even = (n+1)/2;
        long odd = n/2;

        long p1 = solve(5, even, mod);
        long p2 = solve(4, odd, mod);

        return (int)((p1*p2)%mod);
    }
    public static long solve(long base, long expo, int mod){
        if(expo == 0){
            return 1;
        }
        if(expo%2 == 0){
            return solve((base*base)%mod, expo/2, mod);
        }else{
            return (base * solve((base*base)%mod, expo/2, mod)%mod);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countGoodNumbers(n));
    }
}
