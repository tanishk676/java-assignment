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
