import java.util.*;

public class circle {
    public static void main(String args[]) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter radius: ");
        float rad = sc.nextInt();
        float area = 3.14f * rad * rad;
        System.out.println("Area of circle = " + area);
    }
}