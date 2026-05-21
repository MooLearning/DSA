package operations;

import utils.ArrayUtility;

public class ModifyOperation {

    public static void update(int[] arr, int index, int newValue) {

        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid Index!");
            return;
        }

        int[] previous = ArrayUtility.copyArray(arr);

        int oldValue = arr[index];

        arr[index] = newValue;

        ArrayUtility.printOperation(
                "MODIFY",
                previous,
                arr,
                "Modified index " + index +
                " from " + oldValue +
                " to " + newValue);
    }
}
