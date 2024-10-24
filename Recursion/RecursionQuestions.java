public class RecursionQuestions {
    public static void allOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        allOccurance(arr, key, i + 1);
    }

    public static void printDigits(int number, String digits[]) {
        if (number == 0) {
            return;
        }

        int lastDigit = number % 10;
        printDigits(number / 10, digits);
        System.out.print(digits[lastDigit] + " ");
    }

    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return length(str.substring(1)) + 1;
    }

    public static int countSubStr(String str1, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }

        int res = countSubStr(str1, i + 1, j, n - 1) +
                countSubStr(str1, i, j - 1, n - 1) -
                countSubStr(str1, i + 1, j - 1, n - 2);

        if (str1.charAt(i) == str1.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void towerOfHanoi(int m, char source, char destination, char auxiliary) {
        if (m == 1) {
            System.out.println("Move disk 1 from source " + source + " to " + destination);
            return;
        }
        // Move m-1 disks from source to auxiliary, so they are out of the way
        towerOfHanoi(m - 1, source, auxiliary, destination);

        // Move the remaining disk from source to destination
        System.out.println("Move disk " + m + " from source " + source + " to " + destination);

        // Move the m-1 disks that we left on auxiliary to destination
        towerOfHanoi(m - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        allOccurance(arr, 2, 0);
        System.out.println();

        String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        printDigits(12345, digits);
        System.out.println();

        String str = "abcde";
        System.out.println(length(str));

        String str1 = "abcab";
        int n = str1.length();
        System.out.println(countSubStr(str1, 0, n - 1, n));

        int m = 3;
        towerOfHanoi(m, 'A', 'C', 'B');
    }
}
