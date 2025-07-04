package sde1.java;

/*Given an m x n board containing 'X' and 'O', capture all regions surrounded by 'X'.
Any 'O' that is completely surrounded by 'X' should be flipped to 'X'.
'O's connected to the boundary should not be flipped.*/

public class SurroundedRegions {

    public static void main(String[] args){

        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
        };

        captured(board);

        for (char[] row : board){
            for (char c : row){
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }

    private static void captured(char[][] board){

        int m = board.length;
        int n = board[0].length;

        // Step 1: Traverse boundary and mark connected 'O's as 'T'
         for (int i = 0; i < m; i++){
             if (board[i][0] == 'O') dfs(board,i,0);
             if (board[i][n-1] == 'O') dfs(board,i,n-1);
         }

         for (int j = 0; j < n; j++){
             if (board[0][j] == 'O') dfs(board, 0, j);
             if (board[m-1][j] == 'O') dfs(board,m-1,j);
         }

        // Step 2: Flip and restore
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == 'O') board[i][j] = 'X'; // capture
                if (board[i][j] == 'T') board[i][j] = 'O'; // restore
            }
        }


    }

    // DFS to mark safe 'O's as 'T'
    private static void dfs(char[][] board, int i, int j){

        int m = board.length;
        int n = board[0].length;

        if (i < 0 || i >= m || j < 0 || j >= n ||board[i][j] != 'O') return;

        board[i][j] = 'T';

        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);

    }
}
