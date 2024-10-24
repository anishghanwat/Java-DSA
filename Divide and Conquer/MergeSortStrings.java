public class MergeSortStrings {
    public static void printArr(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static String[] mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return new String[] { arr[si] };
        }
        int mid = (si + ei) / 2;
        String arr1[] = mergeSort(arr, si, mid);
        String arr2[] = mergeSort(arr, mid + 1, ei);

        String arr3[] = merge(arr1, arr2);
        return arr3;
    }

    public static String[] merge(String arr1[], String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];

        int id = 0;

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[id] = arr1[i];
                i++;
                id++;
            } else {
                arr3[id] = arr2[j];
                j++;
                id++;
            }
        }

        while (i < m) {
            arr3[id] = arr1[i];
            i++;
            id++;
        }

        while (j < n) {
            arr3[id] = arr2[j];
            j++;
            id++;
        }
        return arr3;
    }

    public static boolean isAlphabeticallySmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        String a[] = mergeSort(arr, 0, arr.length - 1);
        printArr(a);
    }
}
