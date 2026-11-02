public class Main {
    public static void main(String[] args) {
        int[] a = {45, 52, 80};
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 52) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Not found");
    }
}
