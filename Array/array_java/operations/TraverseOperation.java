package operations;

public class TraverseOperation {

    public static void forward(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " -> ");
            }
        }

        System.out.println();
    }

    public static void reverse(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " -> ");
            }
        }

        System.out.println();
    }
}
