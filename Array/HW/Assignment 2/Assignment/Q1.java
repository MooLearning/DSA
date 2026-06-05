public class Q1 {

  static void automation_system(int matrix[][]) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    int max = Integer.MIN_VALUE;
    int total_attendance = -1;
    int row_idx = -1;
    int col_idx = -1;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        total_attendance += matrix[i][j];
        if (matrix[i][j] > max) {
          max = matrix[i][j];
          row_idx = i;
          col_idx = j;
        }
      }
    }

    System.out.println("Total Attendance = " + total_attendance);
    System.out.println("Maximum Attendance = " + max + " at [" + row_idx + ", " + col_idx + "]");
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 12, 18, 9 },
        { 20, 15, 25 },
        { 8, 30, 10 }
    };
    automation_system(matrix);
  }
}
