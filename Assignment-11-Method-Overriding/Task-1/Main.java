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
