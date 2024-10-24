public class Sudoku {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        //row
        for (int x = 0; x < 9; x++) {
            if (sudoku[row][x] == digit) {
                return false;
            }
        }

        //col
        for (int x = 0; x < 9; x++) {
            if (sudoku[x][col] == digit) {
                return false;
            }
        }

        //grid
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for(int i= startRow; i<startRow+3; i++) {
            for(int j=startCol; j<startCol+3; j++) {
                if(sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        //base case
        if(row == 9) {
            return true;
        }
        //recursion
        int nextRow = row, nextCol = col+1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if(sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit = 1; digit<=9; digit++) {
            if(isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        int sudoku[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(sudokuSolver(sudoku, 0, 0)) {
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists");
        }
    }
}
