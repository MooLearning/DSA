import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
  public static void removeOrder(int[] orders, int size, int index) {
    if (index < 0 || index >= size) {
      return;
    }
    for (int i = index; i < size - 1; i++) {
      orders[i] = orders[i + 1];
    }
    orders[size - 1] = 0;
  }

  public static void main(String[] args) throws Exception {
    System.setIn(new FileInputStream("input.txt"));
    System.setOut(new PrintStream("output.txt"));

    Scanner sc = new Scanner(System.in);
    int[] orders = new int[6];
    for (int i = 0; i < orders.length; i++) {
      orders[i] = sc.nextInt();
    }
    int size = sc.nextInt();
    int indexToRemove = sc.nextInt();

    removeOrder(orders, size, indexToRemove);

    System.out.println(Arrays.toString(orders));
    sc.close();
  }
}
