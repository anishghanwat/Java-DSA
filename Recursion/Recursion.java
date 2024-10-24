public class Recursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = sumOfN(n - 1);
        int fn = n + fnm1;
        return fn;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }

    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int lastIndex = lastOccurance(arr, key, i + 1);
        if (lastIndex != -1) {
            return lastIndex;
        }
        if (arr[i] == key) {
            return i;
        }
        return -1;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int x, int n) {

        // Time Complexity = O(log n)
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizedPower(x, n / 2);
        int halfpowersq = halfpower * halfpower;

        if (n % 2 != 0) {
            halfpowersq = x * halfpowersq;
        }

        return halfpowersq;
    }

    public static void main(String[] args) {
        printDec(10);
        System.out.println();
        printInc(10);
        System.out.println("\nFactorial is: " + fact(5));
        System.out.println("Sum of n natural no. is: " + sumOfN(5));
        System.out.println("Fibonacci: " + fib(8));

        int arr[] = { 1, 2, 3, 4, 5, 5 };
        System.out.println(isSorted(arr, 0));
        System.out.println(firstOccurance(arr, 3, 0));
        System.out.println(lastOccurance(arr, 5, 0));

        System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 10));

    }
}
