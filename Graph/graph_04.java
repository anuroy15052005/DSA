package Graph;

// Weighted directed
import java.util.Scanner;
public class graph_04 {
    public static int[][] graph(int[][] nums, int v){
        int[][] adj_mat = new int[v][v];
        for(int[] pair: nums){
            int from = pair[0];
            int to = pair[1];
            adj_mat[from][to] = pair[2];
        }
        return adj_mat;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter no. of edges: ");
        int e = sc.nextInt();
        int[][] nums = new int[e][3];
        System.out.print("Enter "+3*e+" elements: ");
        for(int i = 0;  i < e; i++){
            for(int j = 0; j < 3; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println("Adjacency matrix:");
        int[][] ans = graph(nums, v);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans.length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
