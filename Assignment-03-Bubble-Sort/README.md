# Assignment 3: Bubble Sort

**Aim:** Sort an array by comparing neighbouring values and swapping them when they are out of order.

## Tasks

### Task 1: Perform one pass of bubble sort
**Problem / Theory:** Perform only one left-to-right pass on the array and print its values.

```java
public class Main {
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        for (int value : a) System.out.println(value);
    }
}
```

**Expected Output:**
```
1
4
2
5
8
```

### Task 2: Sort array using bubble sort
**Problem / Theory:** Use nested loops to sort the complete array in ascending order.

```java
public class Main {
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int value : a) System.out.println(value);
    }
}
```

**Expected Output:**
```
1
2
4
5
8
```

### Task 3: Sort a three-element array
**Problem / Theory:** Sort the array {9, 7, 3} using bubble sort.

```java
public class Main {
    public static void main(String[] args) {
        int[] a = {9, 7, 3};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int value : a) System.out.println(value);
    }
}
```

**Expected Output:**
```
3
7
9
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Bubble Sort is a comparison-based sorting algorithm where adjacent elements are repeatedly swapped if they are in the wrong order.

**Q2: What is the role of the loop, method, or class?**
- **Answer:** The outer loop tracks passes (n - 1 passes), while the inner loop compares adjacent elements and bubbles up the largest unsorted element to the end.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Worst and Average Time Complexity: O(n^2). Best Case (already sorted with flag optimization): O(n). Space Complexity: O(1) in-place.
