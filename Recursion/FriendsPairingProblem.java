public class FriendsPairingProblem {
    public static int pairingProblem(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // // single
        // int fnm1 = pairingProblem(n - 1);

        // // pair
        // int fnm2 = pairingProblem(n - 2);

        // int pairWays = (n - 1) * fnm2;

        // int totalWays = fnm1 + pairWays;
        // return totalWays;

        return pairingProblem(n-1) + (n-1) * pairingProblem(n-2);
    }

    public static void main(String[] args) {
        System.out.println(pairingProblem(3));
    }
}
