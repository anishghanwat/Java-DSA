public class InversionCount {
    public static int merge(int arr[], int left, int mid, int right) {
        int i = left, j = mid + 1, k = 0;
        int inversions = 0;
        int[] temp = new int[right - left + 1];

        // Merge both halves while counting inversions
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                inversions += (mid - i + 1);  // Count inversions
                j++;
            }
            k++;
        }

        // Copy remaining elements from left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half, if any
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to original array
        for (int index = 0; index < temp.length; index++) {
            arr[left + index] = temp[index];
        }

        return inversions;
    }

    public static int mergeSort(int arr[], int left, int right) {
        int inversions = 0;

        if (left < right) {
            int mid = (left + right) / 2;

            inversions += mergeSort(arr, left, mid);
            inversions += mergeSort(arr, mid + 1, right);
            inversions += merge(arr, left, mid, right);
        }

        return inversions;
    }

    public static int getInversions(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println("Number of inversions: " + getInversions(arr));
    }
}
