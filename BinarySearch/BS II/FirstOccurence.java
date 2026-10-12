public class FirstOccurence {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 4, 4, 4, 6, 8};
        int target = 4;
        int result = findOccurence(arr,target);
        System.out.println("The index of the first " + target + " is: " + result); 
    }
    static int findOccurence (int[] arr, int target){

       int ans = -1;
       int start = 0;
       int end = arr.length - 1;

       while (start <= end) {

       int mid = start + (end - start) / 2;

           if (arr[mid] == target) {                             
               ans = mid;       // Save the index                                           mid = 3, so arr[3] == 4. We save ans = 3.
               end = mid - 1;   // Search the left half for an earlier occurrence           We set end = mid - 1, so the next search is only indices 0–2. Now mid = 1, and arr[1] = 2.

            } else if (arr[mid] < target) {
               start = mid + 1; // Target must be on the right
            } else {
              end = mid - 1;   // Target must be on the left
            }
        }
        return ans;
    }
}

