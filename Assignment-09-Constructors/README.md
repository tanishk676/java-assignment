# Assignment 9: Constructors

**Aim:** Initialize object fields when objects are created by using constructors.

## Tasks

### Task 1: Default constructor
**Problem / Theory:** Create a Box whose no-argument constructor sets width to 10.

```java
class Box {
    int width;
    Box() {
        width = 10;
    }
}
public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("Width: " + b.width);
    }
}
```

**Expected Output:**
```
Width: 10
```

### Task 2: Parameterized constructor
**Problem / Theory:** Use a parameterized constructor to set the width of a Box.

```java
class Box {
    int width;
    Box(int width) {
        this.width = width;
    }
}
public class Main {
    public static void main(String[] args) {
        Box b = new Box(25);
        System.out.println("Width: " + b.width);
    }
}
```

**Expected Output:**
```
Width: 25
```

### Task 3: Counter constructor and increment
**Problem / Theory:** Initialize count to zero and increment it three times.

```java
class Counter {
    int count;
    Counter() {
        count = 0;
    }
    void increment() {
        count++;
    }
}
public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment();
        c.increment();
        c.increment();
        System.out.println("Count: " + c.count);
    }
}
```

**Expected Output:**
```
Count: 3
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Constructors in Java: special methods invoked automatically at object creation (`new`) to initialize state, including default and parameterized constructors.

**Q2: What is the role of the loop, method, or class?**
- **Answer:** Constructors ensure valid initial state upon instantiation. `this.width = width` disambiguates instance variable from parameter.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Constructor execution is O(1) time and allocates memory on the Java Heap.
