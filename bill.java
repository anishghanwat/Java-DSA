import java.util.*;

public class bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cost of Pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Cost of Pen: ");
        float pen = sc.nextFloat();

        System.out.print("Cost of Eraser: ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Total Cost: " + total);

        //With 18% GST
        float newtotal = total + (0.18f * total);
        //float newtotal = total * 1.18f;
        System.out.println("Total Cost with 18% GST: " + newtotal);
    }
}