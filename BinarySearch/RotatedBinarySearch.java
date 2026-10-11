public class RotatedBinarySearch {
    public static void main(String[] args) {
        
        int[] arr = { 4,5,6,7,0,1,2};
        
        int index = (findPivot(arr));
        System.out.println("The index of the largest element in the array is: "+ index);
        System.out.println("The element is: "+ arr[index]);

    }
    static int findPivot (int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + ( end - start) / 2;

            if ( arr[mid] > arr[mid + 1]  && mid < end){       // edge case to not go out of bounds i.e  n + 1
                return mid;                                    // mid = arr[mid]
            } 
            if ( arr[mid] < arr[mid - 1] && mid > end){
                return mid - 1;                                // end = mid - 1
            } 
            if ( arr[mid] <= arr[start] ){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
