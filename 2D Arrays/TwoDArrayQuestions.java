public class TwoDArrayQuestions {

    // Print the number of 7’s that are inthe 2d array.
    public static void question1(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Number of 7's in the matrix: " + count);
    }

    // Print out the sum of the numbers inthe second row of the “nums” array
    public static void question2(int nums[][]) {
        int sum = 0;
        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }
        System.out.println("Sum of the second row: " + sum);
    }

    // Write a program to FindTransposeofa Matrix
    public static void question3(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transposed = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of the matrix: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        question1(matrix);
        question2(nums);
        question3(matrix);
    }
}
