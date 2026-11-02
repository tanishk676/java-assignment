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
