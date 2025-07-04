package sde1.java;

/*Given two binary matrices grid1 and grid2 of the same size,
an island in grid2 is considered a sub-island if every cell of the island is also land in grid1.
Count the number of sub-islands in grid2.

Input: int[][] grid1 = {
        {1, 1, 1, 0, 0},
        {0, 1, 1, 1, 0},
        {0, 0, 0, 1, 0},
        {1, 1, 0, 0, 0}
};
int[][] grid2 = {
        {1, 1, 1, 0, 0},
        {0, 0, 1, 1, 0},
        {0, 1, 0, 1, 0},
        {1, 1, 0, 0, 0}
};
Output: 2*/

public class CountSubIslands {

    public static void main(String[] args){

        int[][] grid1 = {
                {1, 1, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 0, 0}
        };

        int[][] grid2 = {
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 1, 0, 1, 0},
                {1, 1, 0, 0, 0}
        };

        System.out.println("Number of Sub Island: " + numOfSubIsland(grid1,grid2));

    }

    private static int numOfSubIsland(int[][] grid1, int[][] grid2){

        int m = grid2.length;
        int n = grid2[0].length;

        int count = 0;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid2[i][j] == 1){
                    if (dfs(grid1,grid2,i,j)){
                        count++;
                    }
                }
            }
        }

        return count;

    }

    private static Boolean dfs(int[][] grid1, int[][] grid2, int i, int j){
        int m = grid2.length;
        int n = grid2[0].length;

        if (i < 0 || i >= m || j < 0 || j >= n || grid2[i][j] == 0) return true;

        grid2[i][j] = 0;

        boolean isIsland = grid1[i][j] == 1;

        isIsland &= dfs(grid1,grid2, i + 1, j);
        isIsland &= dfs(grid1,grid2, i - 1, j);
        isIsland &= dfs(grid1,grid2, i, j + 1);
        isIsland &= dfs(grid1,grid2, i ,j - 1);

        return isIsland;

    }

}
