
public class Q7 {

  static int[] col_wise_sum_2d_array_to_1d_array(int arr[][]) {

    int row = arr.length;
    int col = arr[0].length;
    int sum_arr[] = new int[row];
    int idx = 0;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sum_arr[idx] += arr[j][i];
      }
      idx++;
    }

    return sum_arr;
  }

  static void print_1d_array(int arr[]) {

    int n = arr.length;

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + (i == n - 1 ? "" : " "));
    }

    System.out.println();
  }

  public static void main(String[] args) {

    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    print_1d_array(col_wise_sum_2d_array_to_1d_array(matrix));
  }
}
