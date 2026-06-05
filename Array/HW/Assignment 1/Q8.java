import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
  public static int[] rotateRidersLeft(int[] riders) {
    if (riders.length == 0) {
      return riders;
    }
    int firstRider = riders[0];
    for (int i = 0; i < riders.length - 1; i++) {
      riders[i] = riders[i + 1];
    }
    riders[riders.length - 1] = firstRider;
    return riders;
  }

  public static void main(String[] args) throws Exception {
    if (System.getProperty("ONLINE_JUDGE") == null) {
      System.setIn(new FileInputStream("input.txt"));
      System.setOut(new PrintStream("output.txt"));
    }

    Scanner sc = new Scanner(System.in);

    int arr[] = new int[5];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    rotateRidersLeft(arr);
    System.out.println(Arrays.toString(arr));
    sc.close();
  }
}
