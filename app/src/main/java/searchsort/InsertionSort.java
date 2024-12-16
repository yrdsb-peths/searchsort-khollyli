package searchsort;

public class InsertionSort {
    /**
     * Sort the array arr using insertion sort algorithm.
     */
    public static void sort(int[] arr) {
        // for (int i = 0; i < arr.length; i++) {
        //     int element = arr[i];
        //     int k = i - 1;
        //     while (k >= 0 && arr[k] > element) {
        //         Util.exch(arr, k, k + 1);
        //         k--;
        //     }
        // }
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            for(int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    Util.exch(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
