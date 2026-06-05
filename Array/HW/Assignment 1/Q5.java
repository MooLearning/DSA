import java.util.Arrays;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Q5 {

  static int[] shiftPresentStudents(int arr[]) {

    int pos = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[pos++] = arr[i];
      }
    }

    while (pos < arr.length) {
      arr[pos++] = 0;
    }

    return arr;
  }

  public static void main(String[] args) throws Exception {

    if (System.getProperty("ONLINE_JUDGE") == null) {
      System.setIn(new FileInputStream("input.txt"));
      System.setOut(new PrintStream("output.txt"));
    }

    Scanner sc = new Scanner(System.in);

    int students[] = new int[7];

    for (int i = 0; i < students.length; i++) {
      students[i] = sc.nextInt();
    }
    int result[] = shiftPresentStudents(students);

    System.out.println(Arrays.toString(result));
    sc.close();
  }
}
