public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int largest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > largest) largest = marks[i];
        }
        System.out.println("Largest: " + largest);
    }
}
