# Assignment 12: Recursive Factorial, Sum and Power

**Aim:** Use recursive methods that call themselves with smaller inputs until a base case is reached.

## Tasks

### Task 1: Factorial using recursion
**Problem / Theory:** Calculate factorial recursively with factorial(0) equal to 1.

```java
public class Main {
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
```

**Expected Output:**
```
120
```

### Task 2: Sum from 1 to n
**Problem / Theory:** Calculate the sum of numbers from 1 to n using recursion.

```java
public class Main {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
```

**Expected Output:**
```
55
```

### Task 3: Power using recursion
**Problem / Theory:** Calculate base raised to exp using recursive multiplication.

```java
public class Main {
    static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
```

**Expected Output:**
```
32
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Recursion: a problem-solving technique where a method calls itself with smaller sub-problems until reaching a base condition that terminates recursion.

**Q2: What is the role of the loop, method, or class?**
- **Answer:** The recursive method replaces iterative loops by leveraging the call stack to hold intermediate states until base conditions (e.g. n == 0 or exp == 0) return.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Time complexity: O(n) or O(exp). Space complexity: O(n) or O(exp) auxiliary memory due to the recursive call stack.
