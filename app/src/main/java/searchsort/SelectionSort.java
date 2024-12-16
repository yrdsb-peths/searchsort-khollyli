package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;

            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            Util.exch(arr, i, min);
        }
    }
}
