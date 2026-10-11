// Search in a Mountain Array also known as ZigZag Array
public class MountainArraySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        MountainArraySearch search = new MountainArraySearch();

        int result = search.searchInMountainArray(arr, target);

        System.out.println("Target found at index: " + result);
    }

    // Searches both the ascending and descending parts
    int searchInMountainArray(int[] arr, int target) {

        int peak = findPeakIndex(arr);

        // First, search the ascending part
        int ascendingSearchResult =
                binarySearch(arr, target, 0, peak, true);

        if (ascendingSearchResult != -1) {
            return ascendingSearchResult;
        }

        // If not found, search the descending part
        return binarySearch(
                arr, target, peak + 1, arr.length - 1, false
        );
    }

    // Finds the index of the mountain peak
    static int findPeakIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // Descending: peak may be at mid or to the left
                end = mid;
            } else {
                // Ascending: peak must be to the right
                start = mid + 1;
            }
        }

        return start;
    }

    // Binary search on either ascending or descending order
    static int binarySearch(
            int[] arr,
            int target,
            int start,
            int end,
            boolean isAscending
    ) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {

                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}