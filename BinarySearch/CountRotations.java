public class CountRotations {
    public static void main(String[] args) {
        
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int rotation = (countRotations(arr));
        System.out.println("No of rotations: " + rotation);

    }
    static int countRotations (int[] arr){

        int pivot = findPivot(arr);

        return pivot + 1;    // visuaize the formula  VERY IMPORTANT
    }

    static int findPivot(int[] arr) {                 // Finds where the sorted order drops.

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Check whether mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Check whether mid - 1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Decide which half to search         This runs only if neither of the first two blocks returned.
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
    

