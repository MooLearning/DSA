import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.*;

public class Q3 {

    // ------------- FUNCTION AREA: START -------------

    static int[] removeDamagedTickets(Integer[] tickets, int t) {

        int n = tickets.length;
        int[] result = new int[n];

        int index = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (tickets[i] == t) {

                // Keep only even occurrences (2nd, 4th, ...)
                if (count % 2 == 1) {
                    result[index] = tickets[i];
                    index++;
                }

                count++;

            } else {

                result[index] = tickets[i];
                index++;
            }
        }

        // Remaining positions automatically stay 0
        return result;
    }

    // ------------- FUNCTION AREA: END ---------------

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        if (System.getProperty("ONLINE_JUDGE") == null) {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream("output.txt"));
        }

        // ---------------- START CODE -------------------

        Integer[] tickets = new Integer[8];

        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        int[] result = removeDamagedTickets(tickets, t);

        System.out.println(Arrays.toString(result));

        // ---------------- END CODE ---------------------

        sc.close();

    }
}
