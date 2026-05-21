package utils;

public class ArrayUtility {

    public static void printTitle(String title) {
        System.out.println("\n========== " + title + " ==========\n");
    }

    public static void printArray(int[] arr) {

        System.out.print("[ ");

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println(" ]");
    }

    public static void printOperation(
            String operation,
            int[] previous,
            int[] current,
            String details) {

        System.out.println("Operation : " + operation);
        System.out.println("Details   : " + details);

        System.out.print("Previous  : ");
        printArray(previous);

        System.out.print("Current   : ");
        printArray(current);

        System.out.println();
    }

    public static int[] copyArray(int[] arr) {

        int[] copied = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copied[i] = arr[i];
        }

        return copied;
    }
}
