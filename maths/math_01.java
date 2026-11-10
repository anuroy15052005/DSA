import java.util.Scanner;
class math_01 {
    public static void solve(int n){
        while(n > 0){
            int r = n%10;
            System.out.print(r+" ");
            n = n/10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }
}