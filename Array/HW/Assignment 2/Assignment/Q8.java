/* A security system stores values in a square grid. For a special encryption rule, every element above the primary diagonal must be replaced by the value from its symmetric lower triangle position. After copying, all lower triangle values should become 0. The primary diagonal should not change. Write a method that performs this transformation.
Sample Input:
grid = [
  [5, 1, 2],
  [3, 6, 4],
  [7, 8, 9]
]
Sample Output:
[
  [5, 3, 7],
  [0, 6, 8],
  [0, 0, 9]
]

 */
public class Q8 {
  
  static void col_to_row(int matrix[][]){
    int n = matrix.length;

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
          matrix[i][j] = matrix[j][i];

          if(i > j){
            matrix[i][j] = 0;
          }
        }
      }
    }
  public static void main(String[] args) {
    int[][] matrix = {
        { 5, 1, 2 },
        { 3, 6, 4 },
        { 7, 8, 9 }
    };

    col_to_row(matrix);

    for (int i = 0; i < matrix.length; i++) {
    System.out.println(java.util.Arrays.toString(matrix[i]));
    }
  }

}
