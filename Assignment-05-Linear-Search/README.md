# Assignment 5: Linear Search

**Aim:** Search an array one value at a time and report the index where a value is found.

## Tasks

### Task 1: Search for 80
**Problem / Theory:** Implement linearSearch and search for key 80.

```java
public class Main {
    static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {45, 67, 80, 52, 90};
        System.out.println(linearSearch(a, 80));
    }
}
```

**Expected Output:**
```
2
```

### Task 2: Search for 100
**Problem / Theory:** Implement linearSearch and search for key 100.

```java
public class Main {
    static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {45, 67, 80, 52, 90};
        System.out.println(linearSearch(a, 100));
    }
}
```

**Expected Output:**
```
-1
```

### Task 3: Count occurrences of 52
**Problem / Theory:** Count how many times 52 appears in the given array.

```java
public class Main {
    public static void main(String[] args) {
        int[] a = {52, 10, 52, 7, 52};
        int count = 0;
        for (int value : a) {
            if (value == 52) count++;
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
- **Answer:** Linear Search sequentially checks each element of a list in order until a match is found or the end of the list is reached.

**Q2: What is the role of the loop, method, or class?**
- **Answer:** The linearSearch method encapsulates the search logic; the for loop iterates through indices 0 to length - 1 checking for equality with target key.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Best Case: O(1) when key is at index 0. Worst/Average Case: O(n) when key is at the end or absent. Space complexity is O(1).
