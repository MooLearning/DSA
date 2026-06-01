import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

  static int[] mergeBatteryBackup(Integer[] arr1, Integer[] arr2) {

    int n = arr1.length;
    int[] merged = new int[n];

    for (int i = 0; i < n; i++) {

      if (arr1[i] != null) {
        merged[i] += arr1[i];
      }

      if (arr2[n - 1 - i] != null) {
        merged[i] += arr2[n - 1 - i];
      }
    }

    return merged;
  }

  public static void main(String[] args) throws Exception {

    if (System.getProperty("ONLINE_JUDGE") == null) {

      System.setIn(new FileInputStream("input.txt"));

      System.setOut(new PrintStream("output.txt"));

    }

    Scanner sc = new Scanner(System.in);

    Integer array1[] = new Integer[5];
    Integer array2[] = new Integer[5];

    for (int i = 0; i < array1.length; i++) {

      String val = sc.next();

      if (val.equals("null")) {
        array1[i] = null;
      } else {
        array1[i] = Integer.parseInt(val);
      }
    }

    for (int i = 0; i < array2.length; i++) {

      String val = sc.next();

      if (val.equals("null")) {
        array2[i] = null;
      } else {
        array2[i] = Integer.parseInt(val);
      }
    }

    int[] result = mergeBatteryBackup(array1, array2);

    System.out.println(Arrays.toString(result));

    sc.close();
  }
}
