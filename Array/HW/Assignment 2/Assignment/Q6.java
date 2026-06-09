/*
A library stores book codes in a square 2D array. Each row represents a shelf and each column represents a position on that shelf. The librarian wants to rearrange the shelf system by swapping the top shelf with the bottom shelf, then swapping the first column with the last column. Write a method that modifies the matrix and returns the final arrangement.
Sample Input:
books = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]


Sample Output:
[
  [9, 8, 7],
  [6, 5, 4],
  [3, 2, 1]
]

 */

import java.util.Arrays;

public class Q6 {

  static void swap_rows(int[][] matrix, int pos1, int pos2) {
    int[] temp = matrix[pos1];
    matrix[pos1] = matrix[pos2];
    matrix[pos2] = temp;
  }

  static void swap_columns(int[][] matrix, int pos1, int pos2) {

    int n = matrix.length;

    for (int i = 0; i < n; i++) {
      int temp = matrix[i][pos1];
      matrix[i][pos1] = matrix[i][pos2];
      matrix[i][pos2] = temp;
    }
  }

  static void swap(int[][] matrix) {
    int n = matrix.length;
    swap_rows(matrix, 0, n - 1);
    swap_columns(matrix, 0, n - 1);
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    swap(matrix);

    for (int i = 0; i < matrix.length; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }

  }

}
