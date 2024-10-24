public class productusingfunction {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int product = multiply(a,b);
        
        System.out.println("Product = " + product);
    }
}
