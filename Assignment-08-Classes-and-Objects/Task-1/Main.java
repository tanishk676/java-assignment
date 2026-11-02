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
