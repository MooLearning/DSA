// ============================================================
//  Assignment 1 — Data Structures  |  Solutions in C++
// ============================================================
#include <bits/stdc++.h>
using namespace std;

// ─────────────────────────────────────────────────────────────
// Helper: print a vector
// ─────────────────────────────────────────────────────────────
void printArr(const vector<int>& v) {
    cout << "[";
    for (int i = 0; i < (int)v.size(); i++) {
        cout << v[i];
        if (i + 1 < (int)v.size()) cout << ", ";
    }
    cout << "]\n";
}

// ─────────────────────────────────────────────────────────────
// Q1 — mergeBatteryBackup
// batteryA is read left→right, batteryB is read right→left.
// Null is represented by INT_MIN in the input; treat as 0.
// ─────────────────────────────────────────────────────────────
vector<int> mergeBatteryBackup(vector<int> batteryA, vector<int> batteryB) {
    int n = batteryA.size();
    vector<int> result(n);
    for (int i = 0; i < n; i++) {
        int a = (batteryA[i] == INT_MIN) ? 0 : batteryA[i];
        int b = (batteryB[n - 1 - i] == INT_MIN) ? 0 : batteryB[n - 1 - i];
        result[i] = a + b;
    }
    return result;
}

// ─────────────────────────────────────────────────────────────
// Q2 — mergeShelves
// Identical logic to Q1 but named for shelves.
// shelf1 left→right, shelf2 right→left.
// ─────────────────────────────────────────────────────────────
vector<int> mergeShelves(vector<int> shelf1, vector<int> shelf2) {
    int n = shelf1.size();
    vector<int> result(n);
    for (int i = 0; i < n; i++) {
        int a = (shelf1[i] == INT_MIN) ? 0 : shelf1[i];
        int b = (shelf2[n - 1 - i] == INT_MIN) ? 0 : shelf2[n - 1 - i];
        result[i] = a + b;
    }
    return result;
}

// ─────────────────────────────────────────────────────────────
// Q3 — removeDamagedTickets
// Remove every alternate occurrence of t starting from the
// 1st occurrence (i.e. remove occurrences 1, 3, 5 … keep 2, 4, 6…)
// Shift remaining values left; fill tail with 0.
// ─────────────────────────────────────────────────────────────
vector<int> removeDamagedTickets(vector<int> tickets, int t) {
    // Mark which indices to remove
    int occCount = 0;
    vector<bool> remove(tickets.size(), false);
    for (int i = 0; i < (int)tickets.size(); i++) {
        if (tickets[i] == t) {
            occCount++;
            if (occCount % 2 == 1)   // odd occurrence → remove
                remove[i] = true;
        }
    }
    // Build result: keep non-removed values, then pad with 0
    vector<int> result;
    for (int i = 0; i < (int)tickets.size(); i++)
        if (!remove[i]) result.push_back(tickets[i]);
    while ((int)result.size() < (int)tickets.size())
        result.push_back(0);
    return result;
}

// ─────────────────────────────────────────────────────────────
// Q4 — cleanCoupons
// Same alternate-removal logic applied to coupon codes.
// ─────────────────────────────────────────────────────────────
vector<int> cleanCoupons(vector<int> coupons, int t) {
    int occCount = 0;
    vector<bool> remove(coupons.size(), false);
    for (int i = 0; i < (int)coupons.size(); i++) {
        if (coupons[i] == t) {
            occCount++;
            if (occCount % 2 == 1) remove[i] = true;
        }
    }
    vector<int> result;
    for (int i = 0; i < (int)coupons.size(); i++)
        if (!remove[i]) result.push_back(coupons[i]);
    while ((int)result.size() < (int)coupons.size())
        result.push_back(0);
    return result;
}

// ─────────────────────────────────────────────────────────────
// Q5 — shiftPresentStudents
// Move all non-zero values to the front, keep order, pad with 0.
// ─────────────────────────────────────────────────────────────
vector<int> shiftPresentStudents(vector<int> students) {
    vector<int> result;
    for (int x : students)
        if (x != 0) result.push_back(x);
    while ((int)result.size() < (int)students.size())
        result.push_back(0);
    return result;
}

// ─────────────────────────────────────────────────────────────
// Q6 — insertPatient
// Insert patientID at index; shift elements [index..size-1] right.
// Array has enough trailing zeros to absorb the shift.
// ─────────────────────────────────────────────────────────────
vector<int> insertPatient(vector<int> queue, int size, int patientID, int index) {
    // Shift right from position `size-1` down to `index`
    for (int i = size - 1; i >= index; i--)
        queue[i + 1] = queue[i];
    queue[index] = patientID;
    return queue;
}

// ─────────────────────────────────────────────────────────────
// Q7 — removeOrder
// Remove element at index; shift elements left; put 0 at last
// used position.
// ─────────────────────────────────────────────────────────────
vector<int> removeOrder(vector<int> orders, int size, int index) {
    for (int i = index; i < size - 1; i++)
        orders[i] = orders[i + 1];
    orders[size - 1] = 0;
    return orders;
}

// ─────────────────────────────────────────────────────────────
// Q8 — rotateRidersLeft
// Move first element to the end; shift everything left by 1.
// ─────────────────────────────────────────────────────────────
vector<int> rotateRidersLeft(vector<int> riders) {
    int first = riders[0];
    for (int i = 0; i < (int)riders.size() - 1; i++)
        riders[i] = riders[i + 1];
    riders.back() = first;
    return riders;
}

// ─────────────────────────────────────────────────────────────
// Q9 — rotatePlayersRight
// Move last element to the front; shift everything right by 1.
// ─────────────────────────────────────────────────────────────
vector<int> rotatePlayersRight(vector<int> players) {
    int last = players.back();
    for (int i = (int)players.size() - 1; i > 0; i--)
        players[i] = players[i - 1];
    players[0] = last;
    return players;
}

// ─────────────────────────────────────────────────────────────
// Q10 — reverseParcels
// Return a new array that is the reverse; don't modify original.
// ─────────────────────────────────────────────────────────────
vector<int> reverseParcels(const vector<int>& parcels) {
    vector<int> result(parcels.rbegin(), parcels.rend());
    return result;
}

// ─────────────────────────────────────────────────────────────
// Q11 — Time & Space Complexity (MCQ Answers)
// ─────────────────────────────────────────────────────────────
// Code snippet 1  →  single loop 0..n    → B. O(n)
// Code snippet 2  →  3 fixed statements  → A. O(1)
// Code snippet 3  →  nested loops n×n   → C. O(n²)
// Space snippet 1 →  array of size n    → B. O(n)
// Space snippet 2 →  only `sum` variable→ A. O(1)

// ─────────────────────────────────────────────────────────────
// main — test all functions
// ─────────────────────────────────────────────────────────────
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    // Use INT_MIN to represent null
    const int NUL = INT_MIN;

    cout << "--- Q1: mergeBatteryBackup ---\n";
    // batteryA = [6, null, 4, -2, null], batteryB = [3, 8, null, 5, 7]
    printArr(mergeBatteryBackup({6, NUL, 4, -2, NUL}, {3, 8, NUL, 5, 7}));
    // Expected: [13, 5, 4, 6, 3]

    cout << "--- Q2: mergeShelves ---\n";
    // shelf1 = [12, 5, null, 9], shelf2 = [4, null, 7, 3]
    printArr(mergeShelves({12, 5, NUL, 9}, {4, NUL, 7, 3}));
    // Expected: [15, 12, 0, 13]

    cout << "--- Q3: removeDamagedTickets ---\n";
    printArr(removeDamagedTickets({4, 9, 4, 2, 4, 7, 4, 0}, 4));
    // Expected: [9, 4, 2, 7, 4, 0, 0, 0]

    cout << "--- Q4: cleanCoupons ---\n";
    printArr(cleanCoupons({5, 1, 5, 5, 3, 5, 2, 0}, 5));
    // Expected: [1, 5, 3, 5, 2, 0, 0, 0]

    cout << "--- Q5: shiftPresentStudents ---\n";
    printArr(shiftPresentStudents({101, 0, 203, 0, 305, 406, 0}));
    // Expected: [101, 203, 305, 406, 0, 0, 0]

    cout << "--- Q6: insertPatient ---\n";
    printArr(insertPatient({11, 22, 33, 44, 0, 0}, 4, 99, 2));
    // Expected: [11, 22, 99, 33, 44, 0]

    cout << "--- Q7: removeOrder ---\n";
    printArr(removeOrder({501, 502, 503, 504, 505, 0}, 5, 1));
    // Expected: [501, 503, 504, 505, 0, 0]

    cout << "--- Q8: rotateRidersLeft ---\n";
    printArr(rotateRidersLeft({7, 14, 21, 28, 35}));
    // Expected: [14, 21, 28, 35, 7]

    cout << "--- Q9: rotatePlayersRight ---\n";
    printArr(rotatePlayersRight({10, 20, 30, 40, 50}));
    // Expected: [50, 10, 20, 30, 40]

    cout << "--- Q10: reverseParcels ---\n";
    printArr(reverseParcels({13, 26, 39, 52, 65}));
    // Expected: [65, 52, 39, 26, 13]

    cout << "\n--- Q11: MCQ Answers ---\n";
    cout << "Snippet 1 (single loop)    : B. O(n)\n";
    cout << "Snippet 2 (3 statements)   : A. O(1)\n";
    cout << "Snippet 3 (nested loops)   : C. O(n^2)\n";
    cout << "Space - array of size n    : B. O(n)\n";
    cout << "Space - one variable sum   : A. O(1)\n";

    return 0;
}
