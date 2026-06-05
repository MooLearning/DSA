import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
  public static int[] reverseParcels(int[] parcels) {
    int[] reversed = new int[parcels.length];
    for (int i = 0; i < parcels.length; i++) {
      reversed[i] = parcels[parcels.length - 1 - i];
    }
    return reversed;
  }

  public static void main(String[] args) throws Exception {
    if (System.getProperty("ONLINE_JUDGE") == null) {
      System.setIn(new FileInputStream("input.txt"));
      System.setOut(new PrintStream("output.txt"));
    }

    Scanner sc = new Scanner(System.in);

    int[] parcels = new int[5];
    for (int i = 0; i < parcels.length; i++) {
      parcels[i] = sc.nextInt();
    }
    int[] result = reverseParcels(parcels);
    System.out.println(Arrays.toString(result));
    sc.close();
  }
}
