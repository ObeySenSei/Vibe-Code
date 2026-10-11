// Also known as Bi-Tonic Array           NOTICE THAT WE HAVE NOT BEEN GIVEN ANY TARGET WHICH MAKES IT THAT MUCH HARDER...
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class MountainArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6, 4, 3, 2};

        int result = peakIndexInMountainArray(arr);
        System.out.println("The index of the Largest element in the array is: "+ result);

        System.out.println("The largest element in the array is: " + arr[result]);
        
    }


    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1] ) {          // If the number i am at is currently greater than the next one, it means I am in decreasing part of array.
                end = mid;                           // this may be the ANS, but we still need to look towards the LEFT.....why is why we didnt discard it (end = mid - 1)
            } else {
                start = mid + 1;             // Otherwise it would be that we are in the Asceding part of the array......cuz we know mid+1  >  current mid element
            }                                // Ascending side: peak must be to the right.        Here we can discard the previous value of start
        }
        return start;
    }
}   

