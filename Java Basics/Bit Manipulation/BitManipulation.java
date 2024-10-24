public class BitManipulation {
    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

    }

    // get ith bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // set ith bit
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // clear ith bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // update ith bit
    public static int upateIthBit(int n, int i, int newBit) {

        // approach 1
        /*
         * int bitMask = 1 << i;
         * if (newBit == 0) {
         * return clearIthBit(n, i);
         * } else {
         * return setIthBit(n, i);
         * }
         */

        // approach 2
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastIthBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearRangeInBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = ((1 << i) - 1);
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = (ans * a);
            }
            a = (a * a);
            n = n >> 1;
        }
        return ans;
    }

    public static int modExpo(int a, int n, int p) {
        int ans = 1;
        n = n % p; // reduction
        while (n > 0) {
            if ((n & 1) == 1) { // check LSB = 1
                ans = (ans * a) % p;
            }
            a = (a * a) % p;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        oddEven(10);
        oddEven(11);
        oddEven(5);
        oddEven(4);

        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit(10, 3));

        System.out.println(setIthBit(10, 2));

        System.out.println(clearIthBit(10, 1));

        System.out.println(upateIthBit(10, 2, 1));

        System.out.println(clearLastIthBits(15, 2));

        System.out.println(clearRangeInBits(10, 2, 4));

        System.out.println(isPowerOfTwo(8));

        System.out.println(countSetBits(15));

        System.out.println(fastExpo(5, 3));

        System.out.println(modExpo(2, 10, 1000));
    }
}
