package sde1.java;


/*Starting from the pixel (sr, sc), change the color of all pixels connected 4-directionally
        (up/down/left/right) and having the same original color to the newColor.*/

public class FloodFill {

    public static void main(String[] args){

        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int newColor = 2;
        int sRow = 1;
        int sCol = 1;

        int[][] result = floodFill(image,sRow,sCol,newColor);

        for (int[] row: result){
            for (int pixel : row){
                System.out.print(pixel + " ");
            }
            System.out.println();
        }

    }

    private static int[][] floodFill(int[][] image, int sRow, int sCol, int newColor){

        int  originalColor = image[sRow][sCol];
        if (originalColor != newColor){
            dfs(image, sRow, sCol, originalColor, newColor);
        }

        return image;

    }

    private static void dfs(int[][] image, int i, int j, int color, int newColor){

        int m = image.length;
        int n = image[0].length;

        if (i < 0 || i >= m || j < 0 || j >= n || image[i][j] != color) return;

        image[i][j] = newColor;

        dfs(image, i + 1, j, color, newColor);
        dfs(image, i - 1, j, color, newColor);
        dfs(image, i, j - 1, color, newColor);
        dfs(image, i, j + 1, color, newColor);

    }
}
