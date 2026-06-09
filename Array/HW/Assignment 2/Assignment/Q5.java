/*

Q5
An exam hall is represented by a square matrix. Each cell contains a risk score based on student movement. The authority wants to compare the risk of the primary diagonal and the secondary diagonal because these seats are directly visible from the invigilator’s desk. Write a method that returns the absolute difference between the primary diagonal sum and the secondary diagonal sum.
Sample Input:
hall = [
  [10, 2, 3, 4],
  [5, 20, 7, 8],
  [9, 10, 30, 12],
  [13, 14, 15, 40]
]



Sample Output:
66


Explanation:
Primary diagonal = 10 + 20 + 30 + 40 = 100
Secondary diagonal = 4 + 7 + 10 + 13 = 34
Difference = |100 - 34| = 66




*/

public class Q5 {

  static int difference(int[][] matrix) {
    int primary_sum = 0;
    int secondary_sum = 0;
    int n = matrix.length;

    for (int i = 0; i < n; i++) {
      primary_sum += matrix[i][i];
      secondary_sum += matrix[i][n - 1 - i];
    }

    return Math.abs(primary_sum - secondary_sum);
  }

  public static void main(String[] args) {
    int[][] matrix = {
        {10, 2, 3, 4},
        {5, 20, 7, 8},
        {9, 10, 30, 12},
        {13, 14, 15, 40}
    };

    System.out.println(difference(matrix)); // Output: 66
  }
}