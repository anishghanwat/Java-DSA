import java.util.*;

public class continuekey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println(num);
        }while(true);
    }
}
