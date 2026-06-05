
public class Q8 {

  static void row_wise_sum_2d_array_idx(int arr[][]) {

    int row = arr.length;
    int col = arr[0].length;
    int sum_arr[] = new int[row];
    int idx = 0;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sum_arr[idx] += arr[i][j];
      }
      idx++;
    }
    int max = Integer.MIN_VALUE;
    int max_idx = -1;

    for (int i = 0; i < sum_arr.length; i++) {
      if (sum_arr[i] >= max) {
        max_idx = i;
        max = sum_arr[i];
      }
    }
    System.out.println("Row index : " + max_idx);
    System.out.println("Maximum Row sum : " + max);

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
        { 10, 20, 30 },
        { 4, 5, 6 }
    };

    row_wise_sum_2d_array_idx(matrix);

  }
}
