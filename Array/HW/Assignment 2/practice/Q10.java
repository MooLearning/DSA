public class Q10 {
  static int primary_diagonal_sum(int arr[][]) {

    int row = arr.length;
    int col = arr[0].length;
    int sum = 0;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (i == j) {
          sum += arr[i][j];
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) throws Exception {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    System.out.println(primary_diagonal_sum(matrix));
  }
}
