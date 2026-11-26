package Graph;

import java.util.Scanner;
import java.util.ArrayList;
class Pair{
    int to;
    int wt;
    Pair(int to, int wt){
        this.to = to;
        this.wt = wt;
    }
}
public class graph_08 {
    public static ArrayList<ArrayList<Pair>> solve(int[][] edges, int v){
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] curr: edges){

            int from = curr[0];
            int to = curr[1];
            int wt = curr[2];

            Pair t1 = new Pair(to, wt);
            Pair t2 = new Pair(from, wt);

            adj.get(from).add(t1);
            adj.get(to).add(t2);
        }
        return adj;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter Edges: ");
        int e = sc.nextInt();
        int[][] edges = new int[e][3];
        System.out.print("Enter "+3*e+" Elements.");
        for(int i = 0; i < e; i++){
            for(int j = 0; j < 3; j++){
                edges[i][j] = sc.nextInt();
            }
        }
        ArrayList<ArrayList<Pair>> ans = solve(edges, v);
        for(int i = 0; i < ans.size(); i++){
            System.out.print(i + " -> ");
            for(int j = 0; j < ans.get(i).size(); j++){
                Pair p = ans.get(i).get(j);
                System.out.print("(" + p.to + ", " + p.wt + ") ");
            }
            System.out.println();
        }
        sc.close();
    }
}
