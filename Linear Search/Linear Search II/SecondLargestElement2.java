public class SecondLargestElement2 {
     public static void main(String[] args) {

        int[] arr = {15, 8, 23, 12, 23, 19};
        
        int result  = findNextLargest (arr);
        System.out.println("Second-largest element: " + arr[result]);    // Now, because result is an index, you can retrieve the actual value from the original array
        System.out.println("Its index: " + result);     

     }

    static int findNextLargest (int[] arr){

        int max = arr[0];                     // let the max value be situated at index 0.

        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        int secondMax = Integer.MIN_VALUE;
        int secondMaxIndex = -1;

        for (int i=1; i<arr.length; i++){
            if (arr[i] < max && arr[i] > secondMax ){
                secondMax = arr[i];
                secondMaxIndex = i;
                }
            }    
        return secondMaxIndex;   
    }
}
