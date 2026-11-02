# Assignment 1: Reading Array Values

**Aim:** Read values from an array by index and by a loop.

## Tasks

### Task 1: Print first and last array values
**Problem / Theory:** Create an integer array and print its first and last elements using indexes.

```java
public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        System.out.println("First: " + marks[0]);
        System.out.println("Last: " + marks[marks.length - 1]);
    }
}
```

**Expected Output:**
```
First: 45
Last: 90
```

### Task 2: Print every array value
**Problem / Theory:** Print every element of the given array using a for loop.

```java
public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
```

**Expected Output:**
```
45
67
80
52
90
```

### Task 3: Find the sum of array values
**Problem / Theory:** Add all array elements with a loop and display the total.

```java
public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("Sum: " + sum);
    }
}
```

**Expected Output:**
```
Sum: 334
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Array indexing and iteration. Arrays store elements in contiguous memory locations and are accessed using zero-based indexing (0 to length - 1).

**Q2: What is the role of the loop, method, or class?**
- **Answer:** Loops (for loop) iterate sequentially across all valid array indices from 0 up to array.length - 1 to access or accumulate values.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Direct index access is O(1). Iterating over an array of size n takes O(n) time and O(1) auxiliary space.
