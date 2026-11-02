# Assignment 13: Recursion on Arrays

**Aim:** Process array elements recursively by advancing or reducing an index.

## Tasks

### Task 1: Sum array recursively
**Problem / Theory:** Return the sum of all array values from index i to the end.

```java
public class Main {
    static int sum(int[] a, int i) {
        if (i == a.length) return 0;
        return a[i] + sum(a, i + 1);
    }
    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(sum(a, 0));
    }
}
```

**Expected Output:**
```
45
```

### Task 2: Maximum array value recursively
**Problem / Theory:** Find the largest array value recursively from index i to the end.

```java
public class Main {
    static int max(int[] a, int i) {
        if (i == a.length - 1) return a[i];
        return Math.max(a[i], max(a, i + 1));
    }
    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(max(a, 0));
    }
}
```

**Expected Output:**
```
15
```

### Task 3: Print array in reverse recursively
**Problem / Theory:** Print values from index i down to index zero using recursion.

```java
public class Main {
    static void printReverse(int[] a, int i) {
        if (i < 0) return;
        System.out.println(a[i]);
        printReverse(a, i - 1);
    }
    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        printReverse(a, a.length - 1);
    }
}
```

**Expected Output:**
```
15
12
9
6
3
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Recursive array processing using an index parameter as the recursion state variable, moving either forwards (i + 1) or backwards (i - 1).

**Q2: What is the role of the loop, method, or class?**
- **Answer:** The recursive method processes element a[i] and combines it with the result of recursive call for the remaining slice, terminating at bounds (i == a.length or i < 0).

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Time complexity: O(n). Auxiliary space: O(n) on the execution stack.
