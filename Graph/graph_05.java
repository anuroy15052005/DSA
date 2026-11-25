package Graph;

import java.util.Scanner;
public class graph_05 {
    public static boolean solve(int[][] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                if(nums[i][j] != nums[j][i]){           // Undirected --> true
                    return false;                       // Directed --> false
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] adj_mat = new int[m][n];
        for(int i = 0;  i < m; i++){
            for(int j = 0; j < n; j++){
                adj_mat[i][j] = sc.nextInt();
            }
        }
        System.out.print(solve(adj_mat));
        sc.close();
    }
}
