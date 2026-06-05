
public class Q4 {
  static void find_max_min_2d_array(int arr[][]) {
    int row = arr.length;
    int col = arr[0].length;
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (arr[i][j] < min) {
          min = arr[i][j];
        }
        if (arr[i][j] > max) {
          max = arr[i][j];
        }
      }
    }
    System.out.println("Maximum : " + max);
    System.out.println("Minimum : " + min);
  }

  public static void main(String[] args) throws Exception {

    int[][] matrix = {
        { 10, 5, 8 },
        { 3, 20, 7 }
    };

    find_max_min_2d_array(matrix);
  }
}
