public class Q3 {

  static void col_wise_sum_2d_array_idx(int arr[][]) {

    int row = arr.length;
    int col = arr[0].length;
    int sum_arr[] = new int[col];

    for (int j = 0; j < col; j++) {
      for (int i = 0; i < row; i++) {
        sum_arr[j] += arr[i][j];
      }
    }
    int min = Integer.MAX_VALUE;
    int min_idx = -1;

    for (int i = 0; i < sum_arr.length; i++) {
      if (sum_arr[i] <= min) {
        min_idx = i;
        min = sum_arr[i];
      }
    }
    System.out.println("Hardest Quiz index : " + min_idx);
    System.out.println("Total Score : " + min);
  }

  public static void main(String[] args) {
    int[][] marks = {
        { 8, 6, 9, 7 },
        { 7, 5, 8, 6 },
        { 9, 4, 7, 8 }
    };
    col_wise_sum_2d_array_idx(marks);
  }
}
