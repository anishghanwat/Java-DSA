public class BitManQuestions {
    public static void Swap(int x, int y) {
        System.out.println("Before Swap: " + x + ", " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After Swap: " + x + ", " + y);
    }

    public static void addOneToInt(int n) {
        System.out.println(n + " + " + 1 + " is " + -~n);
    }

    public static char upperToLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch | ' ');
        }
        return ch;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        Swap(x, y);

        addOneToInt(6);

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(upperToLowerCase(ch));
        }
    }
}
