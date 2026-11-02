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
