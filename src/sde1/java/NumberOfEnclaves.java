package sde1.java;

/*Given a binary matrix grid of size m x n,
    where:
        0 represents water,
        1 represents land.
An enclave is a land cell that cannot reach the boundary of the grid via any number of moves (up, down, left, right).
Your task is to count the number of land cells that are part of enclaves.
Input : grid = [
        [0, 0, 0, 0],
        [0, 0, 1, 0],
        [0, 1, 1, 0],
        [0, 0, 0, 0]
        ]
Output : 3*/

import java.util.Arrays;

public class NumberOfEnclaves {

    public static void main(String[] args){

        int[][] grid = {
                {0,0,0,0},
                {0,0,1,0},
                {0,1,1,0},
                {0,0,0,0},
        };

        System.out.println("Number of Enclaves: " + numOfEnclaves(grid));

    }

    private static int numOfEnclaves(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        // Mark boundary-connected lands with DFS
        for (int i = 0; i <= m; i++){
            dfs(grid,i,0);
            dfs(grid,i, m-1);
        }
        for (int j = 0; j <= n; j++){
            dfs(grid,0,j);
            dfs(grid,n-1,j);
        }

        int count = 0;
        // Count remaining land cells
        /*for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (grid[i][j] == 1){
                    count++;
                }
            }
        }*/
        for (int[] row: grid){
            for (int cell : row){
                count += cell;
            }
        }

        return count;

    }

    private static void dfs(int[][] grid, int i, int j){
        int n = grid.length;
        int m = grid[0].length;

        if (i == 0 || i >= n || j == 0 || j >= m || grid[i][j] == 0) return;

        grid[i][j] = 0;

        dfs(grid,i -1,j);
        dfs(grid,i + 1,j);
        dfs(grid,i,j - 1);
        dfs(grid,i,j + 1);
    }

}
