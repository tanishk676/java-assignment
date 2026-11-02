# Assignment 2: Largest, Smallest and Count

**Aim:** Find the largest and smallest array values and count values greater than a given limit.

## Tasks

### Task 1: Find the largest value
**Problem / Theory:** Find the largest element in the array using a loop.

```java
public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int largest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > largest) largest = marks[i];
        }
        System.out.println("Largest: " + largest);
    }
}
```

**Expected Output:**
```
Largest: 90
```

### Task 2: Find the smallest value
**Problem / Theory:** Find the smallest element in the array using a loop.

```java
public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int smallest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < smallest) smallest = marks[i];
        }
        System.out.println("Smallest: " + smallest);
    }
}
```

**Expected Output:**
```
Smallest: 45
```

### Task 3: Count values greater than 60
**Problem / Theory:** Count the number of array elements whose value is greater than 60.

```java
public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int count = 0;
        for (int value : marks) {
            if (value > 60) count++;
        }
        System.out.println("Count: " + count);
    }
}
```

**Expected Output:**
```
Count: 3
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Linear traversal of an array with conditional comparison to keep track of extreme values (maximum/minimum) and filter counts.

**Q2: What is the role of the loop, method, or class?**
- **Answer:** The loop iterates through each element so that every element is compared against the current minimum/maximum or tested against the condition (> 60).

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Time complexity is O(n) as each element is visited once. Space complexity is O(1).
