# Assignment 8: Classes and Objects

**Aim:** Create classes with fields and methods, then create and use objects.

## Tasks

### Task 1: Student class and object
**Problem / Theory:** Create a Student object and display its roll number and name.

```java
class Student {
    int roll;
    String name;
    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 5;
        s.name = "Rohan";
        s.show();
    }
}
```

**Expected Output:**
```
Roll: 5
Name: Rohan
```

### Task 2: Create two Student objects
**Problem / Theory:** Create two Student objects and call show() for each.

```java
class Student {
    int roll;
    String name;
    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 5; s1.name = "Rohan";
        Student s2 = new Student();
        s2.roll = 8; s2.name = "Meera";
        s1.show();
        s2.show();
    }
}
```

**Expected Output:**
```
Roll: 5
Name: Rohan
Roll: 8
Name: Meera
```

### Task 3: Book isLong method
**Problem / Theory:** Create a Book class whose isLong() method returns true when pages exceed 300.

```java
class Book {
    int pages;
    boolean isLong() {
        return pages > 300;
    }
}
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(); b1.pages = 450;
        Book b2 = new Book(); b2.pages = 120;
        System.out.println(b1.isLong());
        System.out.println(b2.isLong());
    }
}
```

**Expected Output:**
```
true
false
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Object-Oriented Programming (OOP) fundamentals: classes as blueprints and objects as runtime instances possessing state (fields) and behavior (methods).

**Q2: What is the role of the loop, method, or class?**
- **Answer:** The class defines member attributes (e.g., roll, name, pages) and methods (show(), isLong()) that operate on the object's instance state.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Object instantiation and member access/method invocation take O(1) time and memory overhead proportional to the object fields.
