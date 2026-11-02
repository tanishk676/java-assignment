public class Main {
    static char[] letters = {'a', 'b', 'c'};
    static boolean[] used = new boolean[3];
    static char[] result = new char[3];

    static void arrange(int pos) {
        if (pos == result.length) {
            System.out.println(new String(result));
            return;
        }
        for (int i = 0; i < letters.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[pos] = letters[i];
                arrange(pos + 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        arrange(0);
    }
}
