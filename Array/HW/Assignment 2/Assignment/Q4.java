
static int[] row_wise_sum_2d_array_to_1d_array(int arr[][]) {

  int row = arr.length;
  int col = arr[0].length;
  int sum_arr[] = new int[row];

  for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
      sum_arr[i] += arr[i][j];
    }
  }

  return sum_arr;
}

static int[] col_wise_sum_2d_array_to_1d_array(int arr[][]) {

  int row = arr.length;
  int col = arr[0].length;
  int sum_arr[] = new int[row];

  for (int j = 0; j < col; j++) {
    for (int i = 0; i < row; i++) {
      sum_arr[j] += arr[i][j];
    }
  }

  return sum_arr;
}

static void best_index(int arr[][]) {
  int row_sum[] = row_wise_sum_2d_array_to_1d_array(arr);
  int col_sum[] = col_wise_sum_2d_array_to_1d_array(arr);

  int max_row_sum = Integer.MIN_VALUE;
  int max_col_sum = Integer.MIN_VALUE;
  int best_day_index = -1;
  int best_food_item_index = -1;

  for (int i = 0; i < row_sum.length; i++) {
    if (row_sum[i] > max_row_sum) {
      max_row_sum = row_sum[i];
      best_day_index = i;
    }
  }

  for (int j = 0; j < col_sum.length; j++) {
    if (col_sum[j] > max_col_sum) {
      max_col_sum = col_sum[j];
      best_food_item_index = j;
    }
  }

  System.out.println("Best Day = " + best_day_index);
  System.out.println("Best Food Item = " + best_food_item_index);
}

public static void main(String[] args) {
  int[][] sales = {
      { 100, 200, 150 },
      { 300, 100, 250 },
      { 200, 400, 100 }
  };

  best_index(sales);
}
