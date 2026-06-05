
public class Q3 {
  static int sum_2d_array(int arr[][]) {
    int row = arr.length;
    int col = arr[0].length;
    int sum = 0;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sum += arr[i][j];
      }
    }
    return sum;
  }

  public static void main(String[] args) throws Exception {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
    };
    System.out.println(sum_2d_array(matrix));
  }
}
