package sliding_window;

import java.util.Scanner;
class sw_10 {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int st = 0;
        int e = 0;
        int sum = 0;
        int avg = 0;
        int curr = 0;
        while(e < arr.length){
            sum += arr[e];
            while(e-st+1 > k){
                sum -= arr[st];
                st++;
            }
            avg = sum/k;
            if(e-st+1 == k && avg >= threshold){
                curr++;
            }
            e++;
        }
        return curr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int threshold = sc.nextInt();
        System.out.print(numOfSubarrays(arr, k, threshold));
        sc.close();
    }
}
