public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int count = 0;
        for (int value : marks) {
            if (value > 60) count++;
        }
        System.out.println("Count: " + count);
    }
}
