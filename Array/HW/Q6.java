import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

  static int[] insertPatient(int arr[], int size, int patientID, int index) {

    for (int i = arr.length - 1; i > index; i--) {
      arr[i] = arr[i - 1];
    }

    arr[index] = patientID;
    return arr;
  }

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    if (System.getProperty("ONLINE_JUDGE") == null) {
      System.setIn(new FileInputStream("input.txt"));
      System.setOut(new PrintStream("output.txt"));
    }

    int arr[] = new int[6];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int size = sc.nextInt();
    int patientID = sc.nextInt();
    int index = sc.nextInt();

    int result[] = insertPatient(arr, size, patientID, index);
    System.out.println(Arrays.toString(result));
    sc.close();
  }
}
