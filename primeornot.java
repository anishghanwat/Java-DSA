import java.util.*;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("2 is a Prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(n + " is a Prime number.");
            } else {
                System.out.println(n + " is not a Prime number.");
            }
        }
    }
}
