import java.util.*;

public class average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        float average = (float) (A + B + C) / 3;
        System.out.println("The average is: " + average);    
    }
}