/*A research team stores experimental values in a square matrix. To reduce storage duplication, they want to copy all values from the upper triangle to the lower triangle like a mirror. The primary diagonal should remain unchanged. Write a method that modifies the matrix so that every lower triangle cell becomes equal to its symmetric upper triangle cell.
Sample Input:
data = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]





Sample Output:
[
  [1, 2, 3],
  [2, 5, 6],
  [3, 6, 9]
]




Explanation:
The value at [1][0] becomes value from [0][1].
 The value at [2][0] becomes value from [0][2].
 The value at [2][1] becomes value from [1][2].

 */
import java.util.Arrays;

public class Q7 {
  static void mirror(int matrix[][]){
    int n = matrix.length;

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if(i > j){
          matrix[i][j] = matrix[j][i];
        }
      }
    }
  }
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    mirror(matrix);

    for (int i = 0; i < matrix.length; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }
  }
}
