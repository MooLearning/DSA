import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

    static int[] removeDamagedTickets(Integer[] tickets, int t) {

        int n = tickets.length;
        int[] result = new int[n];

        int index = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (tickets[i] == t) {

                if (count % 2 == 1) {
                    result[index++] = tickets[i];
                }

                count++;

            } else {

                result[index++] = tickets[i];
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception {

        if (System.getProperty("ONLINE_JUDGE") == null) {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream("output.txt"));
        }

        Scanner sc = new Scanner(System.in);

        Integer[] tickets = new Integer[8];

        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        int[] result = removeDamagedTickets(tickets, t);

        System.out.println(Arrays.toString(result));

        sc.close();

    }
}
