# Assignment 10: Parent and Child Classes

**Aim:** Use inheritance so that a child class can access parent class fields and methods.

## Tasks

### Task 1: Dog inherits Animal
**Problem / Theory:** Create Dog as a child of Animal and call the inherited sound() method.

```java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}
class Dog extends Animal {
}
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
```

**Expected Output:**
```
Some sound
```

### Task 2: Student extends Person
**Problem / Theory:** Use super(name) to initialize the parent class field through the child constructor.

```java
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
class Student extends Person {
    Student(String name) {
        super(name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Neha");
        System.out.println("Name: " + s.name);
    }
}
```

**Expected Output:**
```
Name: Neha
```

### Task 3: Teacher inherits greet()
**Problem / Theory:** Create a Teacher object, set its inherited name field, and call greet().

```java
class Person {
    String name;
    void greet() {
        System.out.println("Hello, " + name);
    }
}
class Teacher extends Person {
}
public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Kiran";
        t.greet();
    }
}
```

**Expected Output:**
```
Hello, Kiran
```

## Viva Questions & Answers

**Q1: Explain the main concept used.**
- **Answer:** Inheritance (`extends` keyword in Java), allowing derived classes to inherit accessible fields and methods from base classes, promoting code reusability.

**Q2: What is the role of the loop, method, or class?**
- **Answer:** The child class inherits superclass behaviors; `super(name)` invokes the superclass constructor to properly initialize inherited fields.

**Q3: What is the expected time complexity where applicable?**
- **Answer:** Method dispatch and inheritance hierarchy traversal is resolved with O(1) runtime lookup via vtables.
