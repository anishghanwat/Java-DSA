public class oddEvenInBits {
    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

    }

    public static void main(String[] args) {
        oddEven(10);
        oddEven(11);
        oddEven(5);
        oddEven(4);
    }
}
