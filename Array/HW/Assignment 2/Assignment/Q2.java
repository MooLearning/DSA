import java.util.Arrays;

public class Q2 {
  static void weak_find_and_replace(int matrix[][]) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int weak_devices_count = 0;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] < 50) {
          weak_devices_count++;
          matrix[i][j] = 50;
        }
      }
    }
    System.out.println("Weak Devices = " + weak_devices_count);
    System.out.println("Updated Matrix = ");

    for (int i = 0; i < rows; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }

  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 80, 45, 60 },
        { 30, 90, 55 },
        { 70, 40, 50 }
    };
    weak_find_and_replace(matrix);
  }
}
