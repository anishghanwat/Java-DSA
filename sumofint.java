
//Write a program that reads a set of integers, and then prints the sum of the
//even and odd integers.
import java.util.*;

public class sumofint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int even = 0;
        int odd = 0;

        do {
            System.out.println("Enter number: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }
            System.out.println("Press 1 enter more numbers or 0 to get the sum.");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even numbers = " + even);
        System.out.println("Sum of odd numbers = " + odd);
    }
}
