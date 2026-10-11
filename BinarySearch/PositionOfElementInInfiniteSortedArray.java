public class PositionOfElementInInfiniteSortedArray {
    public static void main(String[] args) {

        int[] arr = {3, 6, 9, 15, 30, 60, 90, 150, 180, 210};
        int target = 15;

        int index = searchInInfiniteArray(arr, target);

        System.out.println("Target found at index: " + index);


    }

    static int searchInInfiniteArray ( int[]arr , int target){   // first find the range
       
        // start with Box size = 2   // Start with a search range of size 2.
        int start = 0; 
        int end = 1;

        // Condition for the target to lie within the Range 
        // If your Target is Greater than 'end' keep doubling it . 
        // When your Target is not Greater then 'end' it means it lies behind it !!

        while (target > arr[end]){        // arr[end] and not just 'end' because remember we need the actual value to compare    //  && end < arr.length - 1
              
        int nextStart = end + 1;      
        // int newEnd = end + (box) * 2       // end = pervious end + sizeofbox * 2  i.e  1 + 2 * 2 = 5   next iteration end = 5 + 4 * 2 i.e.  13
        int nextEnd = end + (end - start + 1) * 2;   // create the array and visaulize the pattern in the indices
        
            start = nextStart;             // update start...         
            end = nextEnd;
        }
        return binarySearch(arr, target, start, end);         // Step 2: Search for the target within the discovered range.
    }


    static int binarySearch (int [] arr , int target , int start, int end){

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        
        return -1;
    }
}

