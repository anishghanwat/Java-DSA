import java.util.*;

public class OpeartorQuestions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }
}
