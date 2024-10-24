import java.util.*;

public class largestof3no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ((A >= B) &&  (A >= C)) {
            System.out.println("A is the Largest.");
        } else if (B >= C) {
            System.out.println("B is the Largest.");
        } else {
            System.out.println("C is the Largest.");
        }
    }
}
