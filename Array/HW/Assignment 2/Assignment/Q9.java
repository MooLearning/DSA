/*A simple image is stored as a square matrix where each value represents a pixel. A photo editing tool needs to rotate the image 90 degrees clockwise. The system cannot create another 2D array because of memory limitations, so the rotation must be done inside the original matrix. Write a method that rotates the matrix clockwise in-place.
Sample Input:
image = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
Sample Output:
[
  [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3]
]

 */

public class Q9 {
  // static void rotate(int matrix[][]){
  //   int n = matrix.length;

  //   for(int i=0; i<n/2; i++){
  //     for(int j=i; j<n-1-i; j++){
  //       int temp = matrix[i][j];
  //       matrix[i][j] = matrix[n-1-j][i];
  //       matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
  //       matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
  //       matrix[j][n-1-i] = temp;
  //     }
  //   }
  // }
  //swap row to column 
  static void row_to_col(int matrix[][]){
    int n = matrix.length;

    for(int i=0; i<n; i++){
      for(int j=i; j<n; j++){
          int temp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = temp;
        }
      }
    }

    //swap columns
  static void swap_columns(int matrix[][]){
    int n = matrix.length;

    for(int i=0; i<n; i++){
      for(int j=0; j<n/2; j++){
          int temp = matrix[i][j];
          matrix[i][j] = matrix[i][n-1-j];
          matrix[i][n-1-j] = temp;
        }
      }
    }

    static void rotate(int matrix[][]){
      row_to_col(matrix);
      swap_columns(matrix);
    }
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    rotate(matrix);

    for (int i = 0; i < matrix.length; i++) {
      System.out.println(java.util.Arrays.toString(matrix[i]));
    }
  }
}