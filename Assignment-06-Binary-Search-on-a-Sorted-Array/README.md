# Assignment 6: Binary Search on a Sorted Array

**Aim:** Search a sorted array by checking the middle value and reducing the search range by half.

## Tasks

### Task 1: Search for 40
**Problem / Theory:** Implement binarySearch and search for key 40 in a sorted array.

```java
public class Main {
    static int binarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == key) return mid;
            if (a[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.println(binarySearch(a, 40));
    }
}
```

**Expected Output:**
```
3
```

### Task 2: Search for 35
**Problem / Theory:** Implement binarySearch and search for key 35 in a sorted array.

```java
public class Main {
    static int binarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == key) return mid;
            if (a[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.println(binarySearch(a, 35));
    }
}
```

**Expected Output:**
```
-1
```

### Task 3: Search for 10
**Problem / Theory:** Implement binarySearch and search for key 10 in a sorted array.

```java
public class Main {
    static int binarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == key) return mid;
            if (a[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.println(binarySearch(a, 10));
    }
}
```

**Expected Output:**
```
0
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Divide and Conquer search algorithm on sorted elements. It compares the target with the middle element and cuts the search space in half each iteration.

**Q2: What is the role of the loop, method, or class?**
- **Answer:** The while loop maintains low and high pointers, recalculating mid = low + (high - low) / 2 to prevent overflow, adjusting bounds until low > high.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Time Complexity: O(log n) worst/average, O(1) best case. Space Complexity: O(1) for iterative binary search.
