import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
  public static int[] rotatePlayersRight(int[] players) {
    if (players.length == 0) {
      return players;
    }
    int lastPlayer = players[players.length - 1];
    for (int i = players.length - 1; i > 0; i--) {
      players[i] = players[i - 1];
    }
    players[0] = lastPlayer;
    return players;
  }

  public static void main(String[] args) throws Exception {
    if (System.getProperty("ONLINE_JUDGE") == null) {
      System.setIn(new FileInputStream("input.txt"));
      System.setOut(new PrintStream("output.txt"));
    }

    Scanner sc = new Scanner(System.in);

    int[] players = new int[5];
    for (int i = 0; i < players.length; i++) {
      players[i] = sc.nextInt();
    }
    int[] result = rotatePlayersRight(players);
    System.out.println(Arrays.toString(result));
    sc.close();
  }
}
