# Assignment 7: Practice Set

**Aim:** Solve short problems involving searching, sorting, loops and conditions.

## Tasks

### Task 1: Search for 52
**Problem / Theory:** Search for 52 in the array and print its index if it is present.

```java
public class Main {
    public static void main(String[] args) {
        int[] a = {45, 52, 80};
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 52) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Not found");
    }
}
```

**Expected Output:**
```
Found at index 1
```

### Task 2: Sort using bubble sort
**Problem / Theory:** Sort the array {3, 1, 2} using bubble sort.

```java
public class Main {
    public static void main(String[] args) {
        int[] a = {3, 1, 2};
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
3
```

### Task 3: Multiply array values
**Problem / Theory:** Multiply all values of the array using a for loop.

```java
public class Main {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        int product = 1;
        for (int value : a) product *= value;
        System.out.println("Product: " + product);
    }
}
```

**Expected Output:**
```
Product: 24
```

### Task 4: Print even values
**Problem / Theory:** Print each even value using a loop and an if statement.

```java
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        for (int value : a) {
            if (value % 2 == 0) System.out.println(value);
        }
    }
}
```

**Expected Output:**
```
2
4
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Core algorithmic fundamentals: searching with flags and early exits, bubble sort, accumulation via product reduction, and modulo filtering.

**Q2: What is the role of the loop, method, or class?**
- **Answer:** Loops iterate over items; conditional blocks execute specific operations (e.g., printing or incrementing accumulator) based on criteria.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Linear search, product, and even-filter: O(n). Bubble sort: O(n^2). Space complexity: O(1).
