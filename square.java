import java.util.*;

public class square {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side of square: ");
        int n = sc.nextInt();

        int area = n * n;
        System.out.println("Area of Square is : " + area);
    }
}