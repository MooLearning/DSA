
public class Q2 {
  static void print_2d_array_column_wise(int arr[][]) {
    int row = arr.length;
    int col = arr[0].length;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr[j][i] + (j == col - 1 ? "" : " "));
      }
      System.out.println();
    }
  }

  public static void main(String[] args) throws Exception {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    print_2d_array_column_wise(matrix);
  }
}
