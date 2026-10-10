public class OrderAgnostic {
    public static void main(String[] args) {
        
        int[] arr = {99, 85, 72, 60, 48, 35, 21, 14, 7, 2};
        int target = 35;

        int ans = orderAgnostic(arr, target);
        System.out.println("The index of value " + target + " is: " + ans);
    }
    static int orderAgnostic(int[]arr, int target){

        int start = 0;
        int end = arr.length - 1;

        // Check whether the sorted array is in Ascending or Descending Order.
        boolean isAscending;

        if (arr[start] < arr[end]) {                 // If the value of START is greater than the value of END.
               isAscending = true;
                System.out.println("The array is in Ascending Order.");
            } else {
                isAscending = false;
                System.out.println("The array is in Descending Order.");
        }

        while (start <= end){
            int mid = start + (end - start) / 2;     // Derive the formula as to Why , we could have used start + mid / 2;

            if (target == arr[mid]){
                return mid;
            }
            
            if (isAscending){
                if (target < arr[mid]){
                   start = mid + 1;                 // we update the index of mid by 1 indice i.e to the Right
                } else {
                  end = mid - 1;
               }
        } else {
                if (target > arr[mid]){
                   end = mid - 1;              // we update the index of mid by 1 indice i.e to the Right
                } else {
                  start = mid + 1;
                }
            }
        }
    return -1;
    }
}
