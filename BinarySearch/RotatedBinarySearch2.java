// https://leetcode.com/problems/search-in-rotated-sorted-array/    GOOD QUESTION !!
public class RotatedBinarySearch2 {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println("Pivot index: " + findPivot(arr));
        System.out.println("Target index: " + search(arr, target));
    }

    static int search(int[] nums, int target) {      // Combines both steps and chooses the correct section.

        int pivot = findPivot(nums);

        // If no pivot exists, the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If the pivot itself is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // Case 3: Target is in the left section                  //  Since 1 is less than nums[0], which is 4, search the second section.
        if (target >= nums[0]) {             
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Case 4: Target is in the right section
        return binarySearch(nums, target, pivot + 1, nums.length - 1);       // Call binarySearch() with this array, this target, and this search range. Then return whatever result binarySearch() gives me.
    }

    static int binarySearch(int[] arr, int target, int start, int end) {         // Finds the target via Binary Search inside a sorted section.

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
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

/*
The main idea: We are not finding the pivot because the pivot is necessarily our answer.
We find it to discover where to search for the target.


System.out.println("Target index: " + search(arr, target));

can print a single number when search() calls findPivot() and binarySearch() internally.
The answer is: methods can call other methods, but each method returns its own result to its caller. The results don't all come out at once.

*/
