# Assignment 15: Subsets and Arrangements

**Aim:** Generate subsets and arrangements by making one choice at a time and undoing choices when needed.

## Tasks

### Task 1: Print all subsets
**Problem / Theory:** Generate all subsets of {1, 2, 3}, skipping and then including each value.

```java
public class Main {
    static int[] a = {1, 2, 3};
    static boolean[] chosen = new boolean[3];

    static void subsets(int i) {
        if (i == a.length) {
            System.out.print("{");
            boolean first = true;
            for (int j = 0; j < a.length; j++) {
                if (chosen[j]) {
                    if (!first) System.out.print(", ");
                    System.out.print(a[j]);
                    first = false;
                }
            }
            System.out.println("}");
            return;
        }
        chosen[i] = false;
        subsets(i + 1);
        chosen[i] = true;
        subsets(i + 1);
    }

    public static void main(String[] args) {
        subsets(0);
    }
}
```

**Expected Output:**
```
{}
{3}
{2}
{2, 3}
{1}
{1, 3}
{1, 2}
{1, 2, 3}
```

### Task 2: Print arrangements of a, b and c
**Problem / Theory:** Generate all arrangements by marking a letter as used and unmarking it after recursion.

```java
public class Main {
    static char[] letters = {'a', 'b', 'c'};
    static boolean[] used = new boolean[3];
    static char[] result = new char[3];

    static void arrange(int pos) {
        if (pos == result.length) {
            System.out.println(new String(result));
            return;
        }
        for (int i = 0; i < letters.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[pos] = letters[i];
                arrange(pos + 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        arrange(0);
    }
}
```

**Expected Output:**
```
abc
acb
bac
bca
cab
cba
```

### Task 3: Print arrangements of x and y
**Problem / Theory:** Generate all arrangements of x and y using a used array.

```java
public class Main {
    static char[] letters = {'x', 'y'};
    static boolean[] used = new boolean[2];
    static char[] result = new char[2];

    static void arrange(int pos) {
        if (pos == result.length) {
            System.out.println(new String(result));
            return;
        }
        for (int i = 0; i < letters.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[pos] = letters[i];
                arrange(pos + 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        arrange(0);
    }
}
```

**Expected Output:**
```
xy
yx
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Backtracking: a systematic algorithmic paradigm for finding all (or some) solutions to computational problems by incrementally building candidates and abandoning candidates ('backtracking') as soon as determined.

**Q2: What is the role of the loop, method, or class?**
- **Answer:** The recursive functions manage decision state (`chosen[i] = true/false` or `used[i] = true/false`), recursing to next depth and reverting state upon return (unmarking).

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Subsets: O(2^n) total subsets. Permutations / Arrangements: O(n!) total arrangements.
