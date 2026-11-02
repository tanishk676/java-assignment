class Counter {
    int count;
    Counter() {
        count = 0;
    }
    void increment() {
        count++;
    }
}
public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment();
        c.increment();
        c.increment();
        System.out.println("Count: " + c.count);
    }
}
