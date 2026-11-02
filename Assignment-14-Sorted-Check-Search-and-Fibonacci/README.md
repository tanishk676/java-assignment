# Assignment 14: Sorted Check, Search and Fibonacci

**Aim:** Use recursion to check ascending order, search an array, and calculate Fibonacci numbers.

## Tasks

### Task 1: Check whether array is sorted
**Problem / Theory:** Return true when the array is in ascending order from index i onward.

```java
public class Main {
    static boolean isSorted(int[] a, int i) {
        if (i >= a.length - 1) return true;
        if (a[i] > a[i + 1]) return false;
        return isSorted(a, i + 1);
    }
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        System.out.println(isSorted(a, 0));
    }
}
```

**Expected Output:**
```
true
```

### Task 2: Find index recursively
**Problem / Theory:** Search for key from index i onward and return -1 if it is absent.

```java
public class Main {
    static int findIndex(int[] a, int key, int i) {
        if (i == a.length) return -1;
        if (a[i] == key) return i;
        return findIndex(a, key, i + 1);
    }
    public static void main(String[] args) {
        int[] a = {45, 67, 80, 52, 90};
        System.out.println(findIndex(a, 80, 0));
    }
}
```

**Expected Output:**
```
2
```

### Task 3: Fibonacci using recursion
**Problem / Theory:** Calculate Fibonacci numbers using the two recursive base cases.

```java
public class Main {
    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
```

**Expected Output:**
```
13
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Advanced recursion including predicate verification on arrays, linear recursive search, and tree-recursion / multi-branch recursion (Fibonacci).

**Q2: What is the role of the loop, method, or class?**
- **Answer:** Recursive functions break problems into sub-problems: sorted check compares adjacent elements recursively; Fibonacci branches into `fib(n-1) + fib(n-2)`.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** isSorted and findIndex: O(n) time, O(n) call stack. Naive recursive Fibonacci: O(2^n) exponential time, O(n) stack space.
