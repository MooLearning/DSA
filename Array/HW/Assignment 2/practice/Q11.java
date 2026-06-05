public class Q11 {

  static int secondary_diagonal_sum(int arr[][]) {
    int row = arr.length;
    int col = arr[0].length;
    int sum = 0;

    for (int i = 0; i < row; i++) {
      sum += arr[i][col - 1 - i];
    }
    return sum;
  }

  public static void main(String[] args) {

    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    System.out.println(secondary_diagonal_sum(matrix));
  }
}
