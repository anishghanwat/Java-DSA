public class CountingSort {
    public static void CountingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int n = arr.length;

        // finding largest
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // frequency count
        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        CountingSort(arr);
        PrintArr(arr);
    }
}
