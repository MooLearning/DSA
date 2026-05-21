class ArrayPrint {
  static void forward_print(int[] array) {
    if (array.length <= 0) {
      System.out.println("Empty Array");
    }

    for (int x : array) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  static void backward_print(int[] array) {
    if (array.length <= 0) {
      System.out.println("Empty Array");
    }

    for (int i = array.length - 1; i >= 0; i--) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public class Q1 {
    public static void main(String[] args) {
      int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

      ArrayPrint.forward_print(arr);
      System.out.println();
      ArrayPrint.backward_print(arr);

    }
  }

}
