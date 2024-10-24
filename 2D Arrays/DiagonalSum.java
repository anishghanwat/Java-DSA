public class DiagonalSum {
    public static int diagonalSum1(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        // This is a brute force method: O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // primary diagonal
                if (i == j) {
                    sum += matrix[i][j];
                }
                // secondary diagonal
                else if (i + j == n - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Optimized code: O(n)
    public static int diagonalSum2(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            sum += matrix[i][matrix.length - i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(diagonalSum1(matrix));
        System.out.println(diagonalSum2(matrix));
    }
}
