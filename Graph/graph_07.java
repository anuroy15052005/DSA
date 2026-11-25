package Graph;

import java.util.Scanner;
import java.util.ArrayList;
public class graph_07 {
    public static ArrayList<ArrayList<Integer>> solve(int[][] edges, int v){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int from = edge[0];
            int to = edge[1];

            adj.get(from).add(to);
        }
        return adj;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter Edges: ");
        int e = sc.nextInt();
        int[][] edges = new int[e][2];
        System.out.print("Enter "+2*e+" Elements.");
        for(int i = 0; i < e; i++){
            for(int j = 0; j < 2; j++){
                edges[i][j] = sc.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> ans = solve(edges, v);
        for(int i = 0; i < ans.size(); i++){
            System.out.print(i + " -> ");
            for(int j = 0; j < ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
