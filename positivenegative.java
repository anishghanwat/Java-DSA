
//Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;

public class positivenegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number : ");

        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is negative");
        }

    }
}
