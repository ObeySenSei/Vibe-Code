//Binary search best for Sorted array
public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = { -4, -2, 0, 1, 2, 3, 4, 6, 11, 12, 24, 36, 48};
        int target = 12;
        
        int ans = binarySearch(arr, target);
        System.out.println("The index of " + target + " in the array is: " + ans);

    }
    static int binarySearch (int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while ( start <= end){
            int mid = start + (end - start) / 2;               // Derive the formula as to Why , we could have used start + mid / 2;
            
            if (target < arr[mid]){                            // If the target is less than the value at arr[mid], then
               end = mid - 1;
            } else if (target > arr[mid]){ 
                start = mid + 1;                           // END and START store indices, not array values. That's the key idea!
            } else {
                return mid;
            }
        }
        return -1;
    }  
}

// One final thing to remember: arr[mid - 1] accesses an element, while mid - 1 calculates an index.
