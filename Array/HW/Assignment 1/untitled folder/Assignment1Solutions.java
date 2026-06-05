
// ============================================================
//  Assignment 1 — Data Structures  |  Solutions in Java
// ============================================================
import java.util.Arrays;

public class Assignment1Solutions {

  // ─────────────────────────────────────────────────────────
  // Q1 — mergeBatteryBackup
  // batteryA read left→right, batteryB read right→left.
  // null treated as 0 using Integer[] (wrapper type).
  // ─────────────────────────────────────────────────────────
  static int[] mergeBatteryBackup(Integer[] batteryA, Integer[] batteryB) {
    int n = batteryA.length;
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      int a = (batteryA[i] == null) ? 0 : batteryA[i];
      int b = (batteryB[n - 1 - i] == null) ? 0 : batteryB[n - 1 - i];
      result[i] = a + b;
    }
    return result;
  }

  // ─────────────────────────────────────────────────────────
  // Q2 — mergeShelves
  // shelf1 left→right, shelf2 right→left. null treated as 0.
  // ─────────────────────────────────────────────────────────
  static int[] mergeShelves(Integer[] shelf1, Integer[] shelf2) {
    int n = shelf1.length;
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      int a = (shelf1[i] == null) ? 0 : shelf1[i];
      int b = (shelf2[n - 1 - i] == null) ? 0 : shelf2[n - 1 - i];
      result[i] = a + b;
    }
    return result;
  }

  // ─────────────────────────────────────────────────────────
  // Q3 — removeDamagedTickets
  // Remove odd-numbered occurrences of t (1st, 3rd, …).
  // Compact left; pad tail with 0.
  // ─────────────────────────────────────────────────────────
  static int[] removeDamagedTickets(int[] tickets, int t) {
    int n = tickets.length;
    int[] temp = new int[n];
    int occCount = 0, idx = 0;

    for (int val : tickets) {
      if (val == t) {
        occCount++;
        if (occCount % 2 == 1)
          continue; // odd → remove
      }
      temp[idx++] = val;
    }
    // remaining slots are already 0 (default int[] value)
    return temp;
  }

  // ─────────────────────────────────────────────────────────
  // Q4 — cleanCoupons
  // Same alternate-removal logic for coupon codes.
  // ─────────────────────────────────────────────────────────
  static int[] cleanCoupons(int[] coupons, int t) {
    int n = coupons.length;
    int[] temp = new int[n];
    int occCount = 0, idx = 0;

    for (int val : coupons) {
      if (val == t) {
        occCount++;
        if (occCount % 2 == 1)
          continue;
      }
      temp[idx++] = val;
    }
    return temp;
  }

  // ─────────────────────────────────────────────────────────
  // Q5 — shiftPresentStudents
  // Move non-zero values to front; pad tail with 0.
  // ─────────────────────────────────────────────────────────
  static int[] shiftPresentStudents(int[] students) {
    int n = students.length;
    int[] result = new int[n]; // default 0
    int idx = 0;
    for (int val : students)
      if (val != 0)
        result[idx++] = val;
    return result;
  }

  // ─────────────────────────────────────────────────────────
  // Q6 — insertPatient
  // Insert patientID at index; shift [index..size-1] right.
  // Array has trailing zeros to absorb the shift.
  // ─────────────────────────────────────────────────────────
  static int[] insertPatient(int[] queue, int size, int patientID, int index) {
    int[] result = Arrays.copyOf(queue, queue.length);
    // Shift right — go backwards to avoid overwriting
    for (int i = size - 1; i >= index; i--)
      result[i + 1] = result[i];
    result[index] = patientID;
    return result;
  }

  // ─────────────────────────────────────────────────────────
  // Q7 — removeOrder
  // Remove element at index; shift left; zero last used slot.
  // ─────────────────────────────────────────────────────────
  static int[] removeOrder(int[] orders, int size, int index) {
    int[] result = Arrays.copyOf(orders, orders.length);
    for (int i = index; i < size - 1; i++)
      result[i] = result[i + 1];
    result[size - 1] = 0;
    return result;
  }

  // ─────────────────────────────────────────────────────────
  // Q8 — rotateRidersLeft
  // First element moves to the end; rest shift left by 1.
  // ─────────────────────────────────────────────────────────
  static int[] rotateRidersLeft(int[] riders) {
    int n = riders.length;
    int[] result = new int[n];
    int first = riders[0];
    for (int i = 0; i < n - 1; i++)
      result[i] = riders[i + 1];
    result[n - 1] = first;
    return result;
  }

  // ─────────────────────────────────────────────────────────
  // Q9 — rotatePlayersRight
  // Last element moves to the front; rest shift right by 1.
  // ─────────────────────────────────────────────────────────
  static int[] rotatePlayersRight(int[] players) {
    int n = players.length;
    int[] result = new int[n];
    int last = players[n - 1];
    for (int i = 1; i < n; i++)
      result[i] = players[i - 1];
    result[0] = last;
    return result;
  }

  // ─────────────────────────────────────────────────────────
  // Q10 — reverseParcels
  // Return a new reversed array; don't modify original.
  // ─────────────────────────────────────────────────────────
  static int[] reverseParcels(int[] parcels) {
    int n = parcels.length;
    int[] result = new int[n];
    for (int i = 0; i < n; i++)
      result[i] = parcels[n - 1 - i];
    return result;
  }

  // ─────────────────────────────────────────────────────────
  // Q11 — MCQ Answers (Time & Space Complexity)
  // Snippet 1 single loop 0..n → B. O(n)
  // Snippet 2 3 fixed statements → A. O(1)
  // Snippet 3 nested loops n×n → C. O(n²)
  // Space 1 array of size n → B. O(n)
  // Space 2 one variable `sum` → A. O(1)
  // ─────────────────────────────────────────────────────────

  // ─────────────────────────────────────────────────────────
  // main — test all functions
  // ─────────────────────────────────────────────────────────
  public static void main(String[] args) {

    System.out.println("--- Q1: mergeBatteryBackup ---");
    System.out.println(Arrays.toString(
        mergeBatteryBackup(new Integer[] { 6, null, 4, -2, null },
            new Integer[] { 3, 8, null, 5, 7 })));
    // Expected: [13, 5, 4, 6, 3]

    System.out.println("--- Q2: mergeShelves ---");
    System.out.println(Arrays.toString(
        mergeShelves(new Integer[] { 12, 5, null, 9 },
            new Integer[] { 4, null, 7, 3 })));
    // Expected: [15, 12, 0, 13]

    System.out.println("--- Q3: removeDamagedTickets ---");
    System.out.println(Arrays.toString(
        removeDamagedTickets(new int[] { 4, 9, 4, 2, 4, 7, 4, 0 }, 4)));
    // Expected: [9, 4, 2, 7, 4, 0, 0, 0]

    System.out.println("--- Q4: cleanCoupons ---");
    System.out.println(Arrays.toString(
        cleanCoupons(new int[] { 5, 1, 5, 5, 3, 5, 2, 0 }, 5)));
    // Expected: [1, 5, 3, 5, 2, 0, 0, 0]

    System.out.println("--- Q5: shiftPresentStudents ---");
    System.out.println(Arrays.toString(
        shiftPresentStudents(new int[] { 101, 0, 203, 0, 305, 406, 0 })));
    // Expected: [101, 203, 305, 406, 0, 0, 0]

    System.out.println("--- Q6: insertPatient ---");
    System.out.println(Arrays.toString(
        insertPatient(new int[] { 11, 22, 33, 44, 0, 0 }, 4, 99, 2)));
    // Expected: [11, 22, 99, 33, 44, 0]

    System.out.println("--- Q7: removeOrder ---");
    System.out.println(Arrays.toString(
        removeOrder(new int[] { 501, 502, 503, 504, 505, 0 }, 5, 1)));
    // Expected: [501, 503, 504, 505, 0, 0]

    System.out.println("--- Q8: rotateRidersLeft ---");
    System.out.println(Arrays.toString(
        rotateRidersLeft(new int[] { 7, 14, 21, 28, 35 })));
    // Expected: [14, 21, 28, 35, 7]

    System.out.println("--- Q9: rotatePlayersRight ---");
    System.out.println(Arrays.toString(
        rotatePlayersRight(new int[] { 10, 20, 30, 40, 50 })));
    // Expected: [50, 10, 20, 30, 40]

    System.out.println("--- Q10: reverseParcels ---");
    System.out.println(Arrays.toString(
        reverseParcels(new int[] { 13, 26, 39, 52, 65 })));
    // Expected: [65, 52, 39, 26, 13]

    System.out.println("\n--- Q11: MCQ Answers ---");
    System.out.println("Snippet 1 (single loop)   : B. O(n)");
    System.out.println("Snippet 2 (3 statements)  : A. O(1)");
    System.out.println("Snippet 3 (nested loops)  : C. O(n^2)");
    System.out.println("Space - array of size n   : B. O(n)");
    System.out.println("Space - one variable sum  : A. O(1)");
  }
}
