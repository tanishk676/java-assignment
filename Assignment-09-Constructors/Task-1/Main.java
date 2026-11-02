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
