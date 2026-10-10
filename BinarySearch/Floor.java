public class Floor {
    public static void main(String[] args) {
        
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 8;

        int ans = findFloor(arr, target);

        if (ans != -1) {                      // The next block of code under return -1 will run. Notice != -1 basically means TRUE.

            System.out.println( "The floor of " + target + " is: " + ans);
        } else {
            System.out.println("No floor exists. The target is greater than the largest element.");
        }
    }
    static int findFloor (int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        if ( target > arr[end]){
            return -1;                  // Compare the target with the last element, not its index.
        }

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] < target){                   // This block of code is executed for this Problem !!
                start = mid + 1; 
            } else if (arr[mid] > target){       
                end = mid - 1;
            } else {
                return arr[mid];            // Exact match
            }
        }
        return arr[end];
    }
}

/* The floor is the greatest element less than or equal to the target

int[] arr = [2, 3, 5, 9, 14, 16, 18];
int target = 8;
ceiling = 5

*/

