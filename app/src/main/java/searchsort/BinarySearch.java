package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public int find(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (target < arr[mid]) {
                hi = mid - 1;
            } else if (target > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * Find the index of the target element in the sorted array arr using binary
     * search recursively. Return -1 if target is not found in arr.
     */
    @Override
    public int recursiveFind(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        return binarySearch(arr, lo, hi, target);
    }

    private int binarySearch(int arr[], int lo, int hi, int target) {
        if (hi < lo) return -1;
        // if (hi >= lo) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target)  {
                return mid;
            }

            if (arr[mid] > target) {
                return binarySearch(arr, lo, mid - 1, target);
            }
                
            return binarySearch(arr, mid + 1, hi, target);
        // }

        // return -1;
    }

}
