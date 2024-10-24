import java.util.*;

public class SwitchCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an expression: ");

        int a = sc.nextInt();
        char operator = sc.next().charAt(0);
        int b = sc.nextInt();
        

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            default:
                System.out.println("Invalid Expression");
                break;
        }
    }

}
