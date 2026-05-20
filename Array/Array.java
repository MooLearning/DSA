import java.util.Arrays;

class Insert {

    // ==================== MANUAL VERSION ====================

    static int[] atBeginning(int[] arr, int value) {
        return atPosition(arr, value, 0);
    }

    static int[] atPosition(int[] arr, int value, int pos) {

        if (pos < 0 || pos > arr.length) {
            System.out.println("Invalid Position!");
            return arr;
        }

        // -------- Manual Logic --------
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = value;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }


        /*
        // -------- Inbuilt Function Logic --------
        int[] newArr = new int[arr.length + 1];

        System.arraycopy(arr, 0, newArr, 0, pos);
        newArr[pos] = value;
        System.arraycopy(arr, pos, newArr, pos + 1, arr.length - pos);
        */


        Utility.operation(
                "INSERT",
                arr,
                newArr,
                "Inserted " + value + " at index [" + pos + "]"
        );

        return newArr;
    }

    static int[] atEnd(int[] arr, int value) {
        return atPosition(arr, value, arr.length);
    }
}


class Modify {

    static void atBeginning(int[] arr, int value) {
        atPosition(arr, value, 0);
    }

    static void atPosition(int[] arr, int value, int pos) {

        if (pos < 0 || pos >= arr.length) {
            System.out.println("Invalid Position!");
            return;
        }

        // -------- Manual Logic --------
        int[] prevArr = arr.clone();
        int oldValue = arr[pos];
        arr[pos] = value;


        /*
        // -------- Inbuilt Function Logic --------
        int[] prevArr = Arrays.copyOf(arr, arr.length);
        int oldValue = arr[pos];
        arr[pos] = value;
        */


        Utility.operation(
                "MODIFY",
                prevArr,
                arr,
                "Modified index [" + pos + "] from " + oldValue + " to " + value
        );
    }

    static void atEnd(int[] arr, int value) {
        atPosition(arr, value, arr.length - 1);
    }
}


class Traverse {

    // ==================== MANUAL VERSION ====================

    static void linear(int[] arr) {

        // -------- Manual Logic --------
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " -> ");
            }
        }

        System.out.println();


        /*
        // -------- Inbuilt Function Logic --------
        System.out.println(Arrays.toString(arr));
        */
    }


    static void reverse(int[] arr) {

        // -------- Manual Logic --------
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


class Search {

    static int linear(int[] arr, int target) {

        // -------- Manual Logic --------
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        /*
        // -------- Inbuilt Function Logic --------
        return Arrays.binarySearch(arr, target);
        */

        return -1;
    }
}


class Utility {

    static void title(String str) {
        System.out.println("\n");
        System.out.println("========== " + str + " ==========");
        System.out.println();
    }


    static void printArray(int[] arr) {

        // -------- Manual Logic --------
        System.out.print("[ ");

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.print(" ]");


        /*
        // -------- Inbuilt Function Logic --------
        System.out.print(Arrays.toString(arr));
        */
    }


    static void operation(
            String operationName,
            int[] previous,
            int[] current,
            String message
    ) {

        System.out.println("\nOperation : " + operationName);
        System.out.println("Details   : " + message);

        System.out.print("Previous  : ");
        printArray(previous);

        System.out.println();

        System.out.print("Current   : ");
        printArray(current);

        System.out.println("\n");
    }
}


public class Array {

    public static void main(String[] args) {

        int[] array = {5, 6, 7, 8, 9};

        Utility.title("Initial Array");
        Traverse.linear(array);


        Utility.title("Insert Operations");

        array = Insert.atBeginning(array, 100);
        array = Insert.atPosition(array, 200, 3);
        array = Insert.atEnd(array, 300);


        Utility.title("Modify Operations");

        Modify.atBeginning(array, 111);
        Modify.atPosition(array, 222, 2);
        Modify.atEnd(array, 333);


        Utility.title("Traversal");

        System.out.println("Linear Traversal:");
        Traverse.linear(array);

        System.out.println();

        System.out.println("Reverse Traversal:");
        Traverse.reverse(array);


        Utility.title("Search");

        int idx = Search.linear(array, 222);

        if (idx != -1) {
            System.out.println("Target found at index : " + idx);
        } else {
            System.out.println("Target not found!");
        }
    }
}