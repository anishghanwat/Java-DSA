import java.util.*;

public class isEven {

    public static boolean isEven(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter an integer: ");
        num = sc.nextInt();

        if(isEven(num)){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}