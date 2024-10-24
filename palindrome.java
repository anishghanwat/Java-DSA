import java.util.*;

public class palindrome {
    public static boolean isPalindrome(int n) {
        int palindrome = n;
        int reverse = 0;

        while (palindrome != 0) {
            int rem = palindrome % 10;

            reverse = reverse * 10 + rem;

            palindrome /= 10;
        }
        if (n == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int palindrome = sc.nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number " + palindrome + " is palindrome!");
        } else {
            System.out.println("Number " + palindrome + " is not palindrome");
        }
    }
}
