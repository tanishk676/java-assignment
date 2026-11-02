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
