# Assignment 1 (DS 3.0)

## Q1 — mergeBatteryBackup
**Problem:**  
A robot has two battery backup lines. The first line is checked from the beginning, and the second line is checked from the end. Create a new array by adding the values from opposite directions. If any value is `null`, treat it as `0`.

**Method Name:** `mergeBatteryBackup`

### Sample Input
```text
batteryA = [6, null, 4, -2, null]
batteryB = [3, 8, null, 5, 7]
```

### Sample Output
```text
[13, 5, 4, 6, 3]
```

### Explanation
```text
6 + 7 = 13
null + 5 = 5
4 + null = 4
-2 + 8 = 6
null + 3 = 3
```

---

## Q2 — mergeShelves

**Method Name:** `mergeShelves`

### Sample Input
```text
shelf1 = [12, 5, null, 9]
shelf2 = [4, null, 7, 3]
```

### Sample Output
```text
[15, 12, 0, 13]
```

---

## Q3 — removeDamagedTickets

**Method Name:** `removeDamagedTickets`

### Sample Input
```text
tickets = [4, 9, 4, 2, 4, 7, 4, 0]
t = 4
```

### Sample Output
```text
[9, 4, 2, 7, 4, 0, 0, 0]
```

---

## Q4 — cleanCoupons

**Method Name:** `cleanCoupons`

### Sample Input
```text
coupons = [5, 1, 5, 5, 3, 5, 2, 0]
t = 5
```

### Sample Output
```text
[1, 5, 3, 5, 2, 0, 0, 0]
```

---

## Q5 — shiftPresentStudents

**Method Name:** `shiftPresentStudents`

### Sample Input
```text
students = [101, 0, 203, 0, 305, 406, 0]
```

### Sample Output
```text
[101, 203, 305, 406, 0, 0, 0]
```

---

## Q6 — insertPatient

**Method Name:** `insertPatient`

### Sample Input
```text
queue = [11, 22, 33, 44, 0, 0]
size = 4
patientID = 99
index = 2
```

### Sample Output
```text
[11, 22, 99, 33, 44, 0]
```

---

## Q7 — removeOrder

**Method Name:** `removeOrder`

### Sample Input
```text
orders = [501, 502, 503, 504, 505, 0]
size = 5
index = 1
```

### Sample Output
```text
[501, 503, 504, 505, 0, 0]
```

---

## Q8 — rotateRidersLeft

**Method Name:** `rotateRidersLeft`

### Sample Input
```text
riders = [7, 14, 21, 28, 35]
```

### Sample Output
```text
[14, 21, 28, 35, 7]
```

---

## Q9 — rotatePlayersRight

**Method Name:** `rotatePlayersRight`

### Sample Input
```text
players = [10, 20, 30, 40, 50]
```

### Sample Output
```text
[50, 10, 20, 30, 40]
```

---

## Q10 — reverseParcels

**Method Name:** `reverseParcels`

### Sample Input
```text
parcels = [13, 26, 39, 52, 65]
```

### Sample Output
```text
[65, 52, 39, 26, 13]
```

---

## Q11 — Complexity MCQs

### 1.
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
Answer: **O(n)**

### 2.
```java
int a = 10;
int b = 20;
int sum = a + b;
System.out.println(sum);
```
Answer: **O(1)**

### 3.
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```
Answer: **O(n²)**

### 4.
```java
int[] arr2 = new int[n];
for (int i = 0; i < n; i++) {
    arr2[i] = i;
}
```
Space Complexity: **O(n)**

### 5.
```java
int sum = 0;
for (int i = 0; i < n; i++) {
    sum = sum + i;
}
```
Space Complexity: **O(1)**
