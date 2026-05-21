package operations;

import utils.ArrayUtility;

public class DeleteOperation {

    public static int[] atBeginning(int[] arr) {

        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        ArrayUtility.printOperation(
                "DELETE",
                arr,
                newArr,
                "Deleted first element");

        return newArr;
    }

    public static int[] atPosition(int[] arr, int position) {

        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid Position!");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        for (int i = position + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        ArrayUtility.printOperation(
                "DELETE",
                arr,
                newArr,
                "Deleted element at index " + position);

        return newArr;
    }

    public static int[] atEnd(int[] arr) {

        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i];
        }

        ArrayUtility.printOperation(
                "DELETE",
                arr,
                newArr,
                "Deleted last element");

        return newArr;
    }
}
