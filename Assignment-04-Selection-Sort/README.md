# Assignment 4: Selection Sort

**Aim:** Find the smallest value in the unsorted portion and move it to the front.

## Tasks

### Task 1: Find index of smallest value
**Problem / Theory:** Use a loop to find and print the index of the smallest element.

```java
public class Main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) minIndex = i;
        }
        System.out.println(minIndex);
    }
}
```

**Expected Output:**
```
4
```

### Task 2: Sort array using selection sort
**Problem / Theory:** Sort the complete array in ascending order using selection sort.

```java
public class Main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) minIndex = j;
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        for (int value : a) System.out.println(value);
    }
}
```

**Expected Output:**
```
11
12
22
25
64
```

### Task 3: Perform first selection-sort step
**Problem / Theory:** Find the smallest element, swap it with the first element, and print the array.

```java
public class Main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) minIndex = i;
        }
        int temp = a[0];
        a[0] = a[minIndex];
        a[minIndex] = temp;
        for (int value : a) System.out.println(value);
    }
}
```

**Expected Output:**
```
11
25
12
22
64
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Selection sort divides the array into sorted and unsorted subarrays, continuously finding the minimum element from the unsorted subarray and placing it at the beginning.

**Q2: What is the role of the loop, method, or class?**
- **Answer:** The outer loop advances the boundary of the unsorted subarray; the inner loop finds the index of the minimum element in the remaining unsorted subarray.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Time complexity is O(n^2) for all cases (worst, average, best) because comparison passes are always executed. Auxiliary Space is O(1).
