/*
A robot collects data from a rectangular field represented by a 2D array. The robot starts from the first row. In the first row, it moves left to right. In the second row, it moves right to left. In the third row, it again moves left to right. This pattern continues until all rows are visited. Write a method that returns a 1D array containing the collected values in snake order.
Sample Input:
field = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 10, 11, 12]
]
Sample Output:
[1, 2, 3, 4, 8, 7, 6, 5, 9, 10, 11, 12]




*/
public class Q11 {
  static int[] snake_order(int matrix[][]){
    int row = matrix.length;
    int col = matrix[0].length;
    int result[] = new int[row * col];
    int idx = 0;

    for(int i=0; i<row; i++){
      if(i % 2 == 0){
        for(int j=0; j<col; j++){
          result[idx++] = matrix[i][j];
        }
      } else {
        for(int j=col-1; j>=0; j--){
          result[idx++] = matrix[i][j];
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[][] field = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };

    int[] result = snake_order(field);
    System.out.println(java.util.Arrays.toString(result));
  }
}
