public class reverseofn {
    public static void main(String[] args) {
        int n = 12345;

        while (n > 0) {
            int r = n % 10;
            System.out.print(r + " ");
            n = n / 10;
        }
    }
}
