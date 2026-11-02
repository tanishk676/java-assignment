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
