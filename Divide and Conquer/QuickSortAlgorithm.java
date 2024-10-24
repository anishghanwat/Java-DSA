public class QuickSortAlgorithm {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // partition
        int pid = partition(arr, si, ei);
        // inner recursive calls
        quickSort(arr, si, pid - 1); // left
        quickSort(arr, pid + 1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // last element as pivot
        int i = si - 1; // index of smaller element than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; // pivot = arr[ei] i.e arr[ei] = arr[i];
        arr[i] = temp;
        return i; // return the index of pivot
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8, -8};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
