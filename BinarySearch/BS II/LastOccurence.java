public class LastOccurence {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 4, 4, 4, 6, 8};

        System.out.println("The index of the last 4 is: " + lastOccurence(arr,4)); 
    }
    static int lastOccurence (int[] arr, int target){

       int ans = -1;
       int start = 0;
       int end = arr.length - 1;

       while (start <= end) {

       int mid = start + (end - start) / 2;

           if (arr[mid] == target) {                             
               ans = mid;       // Save the index                                           mid = 3, so arr[3] == 4. We save ans = 3.
               start = mid + 1;   // Search the right half for more occurrence (right = largest)         We set end = mid - 1, so the next search is only indices 0–2. Now mid = 1, and arr[1] = 2.

            } else if (arr[mid] < target) {
               start = mid + 1; // Target must be on the right
            } else {
              end = mid - 1;   // Target must be on the left
            }
        }
        return ans;
    }
}

/*  If we want to check for the last duplicate index   
/              if (arr[mid] == target)                              
               ans = mid;       // Save the index                                           mid = 3, so arr[3] == 4. We save ans = 3.
               start = mid + 1;


               end = mid - 1  too look for the smallest duplicate number index.
              */ 

    
