import java.util.*;

public class strings {
    public static void main(String[] args) {
        // syntax
        String str = "abcd";
        String str2 = new String("xyz");

        // Input/output
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        // length()
        String fullName = "Anish Ghanwat";
        System.out.println(fullName.length());

        // Concatination
        String firstName = "Anish";
        String lastName = "Ghanwat";
        System.out.println(firstName + " + " + lastName);

        // charAt()
        System.out.println(fullName.charAt(6));

        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();
    }
}
