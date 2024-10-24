public class swap {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + " b = " + b);
    }
    public static void main (String [] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + " b = " + b);

        swap(a,b);
    }
    
}
