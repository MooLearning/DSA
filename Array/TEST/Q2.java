import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    static int[] mergeBatteryBackup(Integer[] arr1, Integer[] arr2) {

        int n = arr1.length;
        int[] merged = new int[n];

        for (int i = 0; i < n; i++) {

            if (arr1[i] != null) {
                merged[i] += arr1[i];
            }

            if (arr2[n - 1 - i] != null) {
                merged[i] += arr2[n - 1 - i];
            }
        }

        return merged;
    }

    public static void main(String[] args) throws Exception {

        // Local file handling
        if (System.getProperty("ONLINE_JUDGE") == null) {

            // Read from input.txt
            System.setIn(new FileInputStream("input.txt"));

            /*
            12 5 null 9
            4 null 7 3
             */

            // Write to output.txt
            System.setOut(new PrintStream("output.txt"));
            /*
            15 12 0 13
             */
        }

        Scanner sc = new Scanner(System.in);

        Integer array1[] = new Integer[4];
        Integer array2[] = new Integer[4];

        // Input array1
        for (int i = 0; i < array1.length; i++) {

            String val = sc.next();

            if (val.equals("null")) {
                array1[i] = null;
            } else {
                array1[i] = Integer.parseInt(val);
            }
        }

        // Input array2
        for (int i = 0; i < array2.length; i++) {

            String val = sc.next();

            if (val.equals("null")) {
                array2[i] = null;
            } else {
                array2[i] = Integer.parseInt(val);
            }
        }

        int[] result = mergeBatteryBackup(array1, array2);

        // for (int i = 0; i < result.length; i++) {
        // System.out.print(result[i] + " ");
        // }

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}