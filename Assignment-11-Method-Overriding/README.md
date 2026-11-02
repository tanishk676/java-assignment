# Assignment 11: Method Overriding

**Aim:** Override a parent class method in a child class to provide a different implementation.

## Tasks

### Task 1: Area of Square
**Problem / Theory:** Override area() in Square to calculate the square's area.

```java
class Shape {
    int area() { return 0; }
}
class Square extends Shape {
    int side;
    int area() { return side * side; }
}
public class Main {
    public static void main(String[] args) {
        Square s = new Square();
        s.side = 4;
        System.out.println("Area: " + s.area());
    }
}
```

**Expected Output:**
```
Area: 16
```

### Task 2: Area of Rectangle
**Problem / Theory:** Override area() in Rectangle to calculate length multiplied by breadth.

```java
class Shape {
    int area() { return 0; }
}
class Rectangle extends Shape {
    int length, breadth;
    int area() { return length * breadth; }
}
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 4; r.breadth = 5;
        System.out.println("Area: " + r.area());
    }
}
```

**Expected Output:**
```
Area: 20
```

### Task 3: Runtime polymorphism with Shape
**Problem / Theory:** Store a Square object in a Shape reference and call the overridden area() method.

```java
class Shape {
    int area() { return 0; }
}
class Square extends Shape {
    int side;
    int area() { return side * side; }
}
public class Main {
    public static void main(String[] args) {
        Shape s = new Square();
        ((Square) s).side = 3;
        System.out.println("Area: " + s.area());
    }
}
```

**Expected Output:**
```
Area: 9
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Runtime Polymorphism (Dynamic Method Dispatch) and Method Overriding, where a subclass provides its own specific implementation of a method declared in its parent class.

**Q2: What is the role of the loop, method, or class?**
- **Answer:** Subclasses override `area()` to implement geometry-specific calculation. At runtime, the JVM determines which implementation to invoke based on the actual object type.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** O(1) time complexity for arithmetic calculations and dynamic method dispatch.
