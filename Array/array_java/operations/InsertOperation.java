package operations;

import utils.ArrayUtility;

public class InsertOperation {

    public static int[] atBeginning(int[] arr, int value) {

        int[] newArr = new int[arr.length + 1];

        newArr[0] = value;

        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        ArrayUtility.printOperation(
                "INSERT",
                arr,
                newArr,
                "Inserted " + value + " at beginning");

        return newArr;
    }

    public static int[] atPosition(int[] arr, int value, int position) {

        if (position < 0 || position > arr.length) {
            System.out.println("Invalid Position!");
            return arr;
        }

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = value;

        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        ArrayUtility.printOperation(
                "INSERT",
                arr,
                newArr,
                "Inserted " + value + " at index " + position);

        return newArr;
    }

    public static int[] atEnd(int[] arr, int value) {

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[arr.length] = value;

        ArrayUtility.printOperation(
                "INSERT",
                arr,
                newArr,
                "Inserted " + value + " at end");

        return newArr;
    }
}
