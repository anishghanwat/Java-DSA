import java.util.*;

public class isprime {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2) {
            isPrime = true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
            isPrime = true;
        }
    }

    
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
}
