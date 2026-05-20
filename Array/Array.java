import java.util.Arrays;

class Insert {

    static int[] atBeginning(int[] arr, int value) {

        // -------- Manual Logic --------
        int[] newArr = new int[arr.length + 1];
        newArr[0] = value;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        /*
        // -------- Inbuilt Function Logic --------
        int[] newArr = new int[arr.length + 1];
        newArr[0] = value;
        System.arraycopy(arr, 0, newArr, 1, arr.length);
        */

        Utility.operation(
            "INSERT",
            arr,
            newArr,
            "Inserted " + value + " at index [0] (beginning)"
        );
        return newArr;
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

        // -------- Manual Logic --------
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value;

        /*
        // -------- Inbuilt Function Logic --------
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = value;
        */

        Utility.operation(
            "INSERT",
            arr,
            newArr,
            "Inserted " + value + " at index [" + arr.length + "] (end)"
        );
        return newArr;
    }
}

class Modify {

    static void atBeginning(int[] arr, int value) {

        // -------- Manual Logic --------
        int[] prevArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            prevArr[i] = arr[i];
        }
        int oldValue = arr[0];
        arr[0] = value;

        /*
        // -------- Inbuilt Function Logic --------
        int[] prevArr = Arrays.copyOf(arr, arr.length);
        int oldValue = arr[0];
        arr[0] = value;
        */

        Utility.operation(
            "MODIFY",
            prevArr,
            arr,
            "Modified index [0] (beginning) from " + oldValue + " to " + value
        );
    }

    static void atPosition(int[] arr, int value, int pos) {
        if (pos < 0 || pos >= arr.length) {
            System.out.println("Invalid Position!");
            return;
        }

        // -------- Manual Logic --------
        int[] prevArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            prevArr[i] = arr[i];
        }
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

        // -------- Manual Logic --------
        int[] prevArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            prevArr[i] = arr[i];
        }
        int oldValue = arr[arr.length - 1];
        arr[arr.length - 1] = value;

        /*
        // -------- Inbuilt Function Logic --------
        int[] prevArr = Arrays.copyOf(arr, arr.length);
        int oldValue = arr[arr.length - 1];
        arr[arr.length - 1] = value;
        */

        Utility.operation(
            "MODIFY",
            prevArr,
            arr,
            "Modified index [" + (arr.length - 1) + "] (end) from " + oldValue + " to " + value
        );
    }
}

class Traverse {

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

        /*
        // -------- Inbuilt Function Logic --------
        int[] reversed = arr.clone();
        for (int i = 0; i < reversed.length / 2; i++) {
            int temp = reversed[i];
            reversed[i] = reversed[reversed.length - 1 - i];
            reversed[reversed.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reversed));
        */
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
        return -1;

        /*
        // -------- Inbuilt Function Logic --------
        // Note: Arrays.binarySearch requires a sorted array
        // It does NOT guarantee the same index as linear search on unsorted arrays
        int sortedIdx = Arrays.binarySearch(arr, target);
        return (sortedIdx >= 0) ? sortedIdx : -1;
        */
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
