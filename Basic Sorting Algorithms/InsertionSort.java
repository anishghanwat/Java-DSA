public class InsertionSort {
    public static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };
        InsertionSort(arr);
        PrintArr(arr);
    }

}
