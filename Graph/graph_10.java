package Graph;

import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
class Solution {
    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int island = 0;
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if(grid[r][c] == '1' && !visited[r][c]){
                    island++;
                    bfs(grid, visited, r, c);
                }
            }
        }
        return island;

    }
    public static void bfs(char[][] grid, boolean[][] visited, int stR, int stC){
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        visited[stR][stC] = true;
        queue.offer(new int[]{stR, stC});

        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for(int[] dir: direction){
                int nr = r+dir[0];
                int nc = c+dir[1];

                if(nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == '1' && !visited[nr][nc]){
                    visited[nr][nc] = true;
                    queue.offer(new  int[]{nr, nc}); 
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] grid = new char[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = sc.next().charAt(0);
            }
        }
        System.out.print(numIslands(grid));
        sc.close();
    }
}
