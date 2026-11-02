public class Main {
    static int[] a = {1, 2, 3};
    static boolean[] chosen = new boolean[3];

    static void subsets(int i) {
        if (i == a.length) {
            System.out.print("{");
            boolean first = true;
            for (int j = 0; j < a.length; j++) {
                if (chosen[j]) {
                    if (!first) System.out.print(", ");
                    System.out.print(a[j]);
                    first = false;
                }
            }
            System.out.println("}");
            return;
        }
        chosen[i] = false;
        subsets(i + 1);
        chosen[i] = true;
        subsets(i + 1);
    }

    public static void main(String[] args) {
        subsets(0);
    }
}
