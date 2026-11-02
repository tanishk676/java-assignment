public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int smallest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < smallest) smallest = marks[i];
        }
        System.out.println("Smallest: " + smallest);
    }
}
