import java.util.*;

public class Avgof3 {

    public static void average(int a, int b, int c) {
        float Avg = (float) (a + b + c) / 3;
        System.out.println(Avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        average(a, b, c);
    }
}