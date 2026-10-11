public class FirstNLastPositionPractice {
    public static void main(String[] args) {
        
        int [] arr = {5, 7, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange (arr,target);

        System.out.println("First occurence of " + target + " is : " + result [0]);
        System.out.println("Last occurence of " + target + " is : " + result [1]);

    }

static int[]  searchRange (int[] arr , int target){

    int[] ans = {-1,-1};   // Lets assume the target does not exist;

    ans [0] = searchIndex (arr,target,true);
    ans [1] = searchIndex (arr,target,false);

    return ans;
}

static int searchIndex (int [] arr , int target , boolean findStartIndex){

    int position = -1;

    int start = 0;
    int end = arr.length - 1;
    
    while (start <= end){
        int mid = start + (end-start) / 2;

        if (target > arr[mid]){
            start = mid + 1;
        } else if ( target < arr[mid]){
            end = mid - 1;
        } else {
            position = mid;

            if (findStartIndex ){
                end = mid - 1;             // First we want to find check whether another 7 exists to the left.
            } else {
                start = mid + 1;           // The loop continues searching to the right until it finds the last occurrence. Only when findStartIndex is false, this is executed.
            }
        }
    }
    return position;
}

}


