# ============================================================
#  Assignment 1 — Data Structures  |  Solutions in Python
# ============================================================

# ─────────────────────────────────────────────────────────────
# Q1 — mergeBatteryBackup
# batteryA read left→right, batteryB read right→left.
# None is treated as 0.
# ─────────────────────────────────────────────────────────────
def mergeBatteryBackup(batteryA, batteryB):
    n = len(batteryA)
    result = []
    for i in range(n):
        a = 0 if batteryA[i] is None else batteryA[i]
        b = 0 if batteryB[n - 1 - i] is None else batteryB[n - 1 - i]
        result.append(a + b)
    return result


# ─────────────────────────────────────────────────────────────
# Q2 — mergeShelves
# shelf1 left→right, shelf2 right→left. None treated as 0.
# ─────────────────────────────────────────────────────────────
def mergeShelves(shelf1, shelf2):
    n = len(shelf1)
    result = []
    for i in range(n):
        a = 0 if shelf1[i] is None else shelf1[i]
        b = 0 if shelf2[n - 1 - i] is None else shelf2[n - 1 - i]
        result.append(a + b)
    return result


# ─────────────────────────────────────────────────────────────
# Q3 — removeDamagedTickets
# Remove every alternate occurrence of t starting from the
# 1st (odd-numbered) occurrence. Shift left; pad tail with 0.
# ─────────────────────────────────────────────────────────────
def removeDamagedTickets(tickets, t):
    occ_count = 0
    result = []
    for val in tickets:
        if val == t:
            occ_count += 1
            if occ_count % 2 == 1:   # odd occurrence → remove (skip)
                continue
        result.append(val)
    # Pad with 0s to keep original length
    result += [0] * (len(tickets) - len(result))
    return result


# ─────────────────────────────────────────────────────────────
# Q4 — cleanCoupons
# Same alternate-removal logic applied to coupon codes.
# ─────────────────────────────────────────────────────────────
def cleanCoupons(coupons, t):
    occ_count = 0
    result = []
    for val in coupons:
        if val == t:
            occ_count += 1
            if occ_count % 2 == 1:
                continue
        result.append(val)
    result += [0] * (len(coupons) - len(result))
    return result


# ─────────────────────────────────────────────────────────────
# Q5 — shiftPresentStudents
# Move all non-zero values to the front; pad tail with 0.
# ─────────────────────────────────────────────────────────────
def shiftPresentStudents(students):
    present = [x for x in students if x != 0]
    absent  = [0] * (len(students) - len(present))
    return present + absent


# ─────────────────────────────────────────────────────────────
# Q6 — insertPatient
# Insert patientID at index; shift elements [index..size-1] right.
# Array has trailing zeros to absorb the shift.
# ─────────────────────────────────────────────────────────────
def insertPatient(queue, size, patientID, index):
    queue = queue[:]          # don't mutate original
    # Shift right from the last occupied position down to index
    for i in range(size - 1, index - 1, -1):
        queue[i + 1] = queue[i]
    queue[index] = patientID
    return queue


# ─────────────────────────────────────────────────────────────
# Q7 — removeOrder
# Remove element at index; shift left; put 0 at last used slot.
# ─────────────────────────────────────────────────────────────
def removeOrder(orders, size, index):
    orders = orders[:]
    for i in range(index, size - 1):
        orders[i] = orders[i + 1]
    orders[size - 1] = 0
    return orders


# ─────────────────────────────────────────────────────────────
# Q8 — rotateRidersLeft
# Move first element to the end; shift everything left by 1.
# ─────────────────────────────────────────────────────────────
def rotateRidersLeft(riders):
    return riders[1:] + [riders[0]]


# ─────────────────────────────────────────────────────────────
# Q9 — rotatePlayersRight
# Move last element to the front; shift everything right by 1.
# ─────────────────────────────────────────────────────────────
def rotatePlayersRight(players):
    return [players[-1]] + players[:-1]


# ─────────────────────────────────────────────────────────────
# Q10 — reverseParcels
# Return a new reversed list; don't modify the original.
# ─────────────────────────────────────────────────────────────
def reverseParcels(parcels):
    return parcels[::-1]


# ─────────────────────────────────────────────────────────────
# Q11 — MCQ Answers (Time & Space Complexity)
# Snippet 1  single loop 0..n       → B. O(n)
# Snippet 2  3 fixed statements     → A. O(1)
# Snippet 3  nested loops n×n       → C. O(n²)
# Space 1    array of size n        → B. O(n)
# Space 2    one variable `sum`     → A. O(1)
# ─────────────────────────────────────────────────────────────


# ─────────────────────────────────────────────────────────────
# main — test all functions
# ─────────────────────────────────────────────────────────────
if __name__ == "__main__":
    print("--- Q1: mergeBatteryBackup ---")
    print(mergeBatteryBackup([6, None, 4, -2, None], [3, 8, None, 5, 7]))
    # Expected: [13, 5, 4, 6, 3]

    print("--- Q2: mergeShelves ---")
    print(mergeShelves([12, 5, None, 9], [4, None, 7, 3]))
    # Expected: [15, 12, 0, 13]

    print("--- Q3: removeDamagedTickets ---")
    print(removeDamagedTickets([4, 9, 4, 2, 4, 7, 4, 0], 4))
    # Expected: [9, 4, 2, 7, 4, 0, 0, 0]

    print("--- Q4: cleanCoupons ---")
    print(cleanCoupons([5, 1, 5, 5, 3, 5, 2, 0], 5))
    # Expected: [1, 5, 3, 5, 2, 0, 0, 0]

    print("--- Q5: shiftPresentStudents ---")
    print(shiftPresentStudents([101, 0, 203, 0, 305, 406, 0]))
    # Expected: [101, 203, 305, 406, 0, 0, 0]

    print("--- Q6: insertPatient ---")
    print(insertPatient([11, 22, 33, 44, 0, 0], 4, 99, 2))
    # Expected: [11, 22, 99, 33, 44, 0]

    print("--- Q7: removeOrder ---")
    print(removeOrder([501, 502, 503, 504, 505, 0], 5, 1))
    # Expected: [501, 503, 504, 505, 0, 0]

    print("--- Q8: rotateRidersLeft ---")
    print(rotateRidersLeft([7, 14, 21, 28, 35]))
    # Expected: [14, 21, 28, 35, 7]

    print("--- Q9: rotatePlayersRight ---")
    print(rotatePlayersRight([10, 20, 30, 40, 50]))
    # Expected: [50, 10, 20, 30, 40]

    print("--- Q10: reverseParcels ---")
    print(reverseParcels([13, 26, 39, 52, 65]))
    # Expected: [65, 52, 39, 26, 13]

    print("\n--- Q11: MCQ Answers ---")
    print("Snippet 1 (single loop)   : B. O(n)")
    print("Snippet 2 (3 statements)  : A. O(1)")
    print("Snippet 3 (nested loops)  : C. O(n^2)")
    print("Space - array of size n   : B. O(n)")
    print("Space - one variable sum  : A. O(1)")
