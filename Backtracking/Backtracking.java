public class Backtracking {
    public static void changeArr(int arr[], int i, int val) {
        // base
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        // backtracking
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }

        // yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);

        // no choice
        findSubsets(str, ans, i + 1);
    }

    public static void findPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        // recursion - O(n * n!)
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String rem = str.substring(0, i) + str.substring(i + 1);
            findPermutations(rem, ans + curr);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

        String str = "abc";
        findSubsets(str, "", 0);
        System.out.println();

        findPermutations(str, "");
    }
}
