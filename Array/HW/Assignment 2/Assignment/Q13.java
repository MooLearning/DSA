/*
 An underground energy detector stores energy levels in a matrix. A point is called a local low-energy point if its value is smaller than all of its valid neighboring cells: top, bottom, left, and right. The detector scans the matrix row-wise and stops at the first local low-energy point. Write a function that returns the position of the first local low-energy point. If no such point exists, return [-1, -1].
Sample Input:
energy = [
  [20, 18, 22],
  [17, 10, 19],
  [21, 16, 23]
]



Sample Output:
[1, 1]


Explanation:
The value at [1][1] is 10.
Its neighbors are 18, 16, 17, and 19.


*/

public class Q13 {
  static int[] low_energy_idx(int matrix[][]) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        int current = matrix[i][j];
        boolean local_low = true;

        // Check top
        if (i > 0 && matrix[i - 1][j] <= current) {
          local_low = false;
        }
        // Check bottom
        if (i < rows - 1 && matrix[i + 1][j] <= current) {
          local_low = false;
        }
        // Check left
        if (j > 0 && matrix[i][j - 1] <= current) {
          local_low = false;
        }
        // Check right
        if (j < cols - 1 && matrix[i][j + 1] <= current) {
          local_low = false;
        }

        if (local_low) {
          return new int[] { i, j };
        }
      }
    }

    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    int[][] energy = {
        { 20, 18, 22 },
        { 17, 10, 19 },
        { 21, 16, 23 }
    };

    int[] result = low_energy_idx(energy);
    System.out.println(java.util.Arrays.toString(result));
  }
}