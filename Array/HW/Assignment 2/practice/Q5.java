
public class Q5 {
  static void even_odd_2d_array(int arr[][]) {
    int row = arr.length;
    int col = arr[0].length;
    int odd = 0, even = 0;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (arr[i][j] % 2 == 0) {
          even++;
        } else {
          odd++;
        }
      }
    }
    System.out.println("Even : " + even);
    System.out.println("Odd : " + odd);
  }

  public static void main(String[] args) throws Exception {

    int[][] matrix = {
        { 10, 5, 8 },
        { 3, 20, 7 }
    };
    even_odd_2d_array(matrix);
  }
}
