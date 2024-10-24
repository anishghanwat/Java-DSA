public class TilingProblem {
    public static int TilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // // vertical
        // int fnm1 = TilingProblem(n - 1);

        // // horizontal
        // int fnm2 = TilingProblem(n - 2);

        // int totalWays = fnm1 + fnm2;
        // return totalWays;

        return TilingProblem(n - 1) + TilingProblem(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(TilingProblem(4));
    }
}
