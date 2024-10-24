import java.util.*;

public class charinput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Char: ");
        char c = sc.nextLine().charAt(1);
        System.out.println("Your Char is: " + c);
    }
}