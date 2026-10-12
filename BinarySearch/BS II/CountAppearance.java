public class CountAppearance {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 5, 5, 5, 5, 8, 9};
        System.out.println("Number of occurrences: " + countOccurence(arr, 5));
    }

    static int countOccurence (int[] arr , int target){

        int first = firstOccurence(arr, target);
        int last = lastOccurence(arr, target);

        if (first == -1 || last == -1){                    // If the target isnt present in the array
            return 0;
        }
        return last - first + 1;
    }

    // check left
    static int firstOccurence (int arr[],int target){

       int ans = -1;
       int start = 0;
       int end = arr.length - 1;

       while (start <= end) {
       int mid = start + (end - start) / 2;

        if (arr[mid] == target){
              ans = mid;
              end = mid - 1;
            }
        else  if ( arr[mid] < target){
             start = mid + 1;
            } else {
              end = mid - 1;
            }
        }
        return ans;
    }

    //check right
       static int lastOccurence (int arr[],int target){

       int ans = -1;
       int start = 0;
       int end = arr.length - 1;

       while (start <= end) {
       int mid = start + (end - start) / 2;

        if (arr[mid] == target){
              ans = mid;
              start = mid + 1;                        // The only change we need to make !
        }
           else if ( arr[mid] < target){
             start = mid + 1;
            } else {
              end = mid - 1;
            }
        }
        return ans;
    }
    
}
