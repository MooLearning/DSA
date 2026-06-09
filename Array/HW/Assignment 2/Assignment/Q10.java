/*A museum has a square security grid. Only the border cameras need to be shifted one step clockwise for recalibration. The inside cameras should remain unchanged. Write a function that rotates only the outer boundary of the matrix one step clockwise and returns the updated matrix.
Sample Input:
grid = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 10, 11, 12],
  [13, 14, 15, 16]
]




Sample Output:
[
  [5, 1, 2, 3],
  [9, 6, 7, 4],
  [13, 10, 11, 8],
  [14, 15, 16, 12]
]



*/

public class Q10 {
  static void rotate_border(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;

        int temp = matrix[0][0];

        // Left column (bottom -> top)
        for (int i = 1; i < n; i++) {
            matrix[i - 1][0] = matrix[i][0];
        }

        // Bottom row (right -> left)
        for (int j = 1; j < m; j++) {
            matrix[n - 1][j - 1] = matrix[n - 1][j];
        }

        // Right column (top -> bottom)
        for (int i = n - 2; i >= 0; i--) {
            matrix[i + 1][m - 1] = matrix[i][m - 1];
        }

        // Top row (left -> right)
        for (int j = m - 2; j >= 1; j--) {
            matrix[0][j + 1] = matrix[0][j];
        }

        matrix[0][1] = temp;
    
  }

  public static void main(String[] args) {
    int[][] grid = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };

    rotate_border(grid);

    for (int i = 0; i < grid.length; i++) {
      System.out.println(java.util.Arrays.toString(grid[i]));
    }
  }
}
