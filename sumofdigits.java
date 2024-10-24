import java.util.*;

public class sumofdigits {

    public static void sum(int number) {
        int mynum = number;
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;

            sum = sum + lastDigit;
            number /= 10;
        }
        System.out.println("sum of " + mynum + " is " + sum);
    }

    public static void main(String[] args) {
        sum(345);
    }
}
