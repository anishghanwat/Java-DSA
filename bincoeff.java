public class bincoeff {
    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bincoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n - r);

        int bincoeff = fact_n / (fact_r * fact_n_r);

        return bincoeff;
    }

    public static void main(String[] agrs) {
        int n = 5;
        int r = 2;
        int fact = bincoeff(n, r);
        System.out.println(fact);
    }
}
