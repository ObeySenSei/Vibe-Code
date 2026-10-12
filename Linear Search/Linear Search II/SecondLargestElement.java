public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr = {12, 5, 19, 8, 19, 14};
        
        int result  = findNextLargest (arr);
        System.out.println("Second-largest element: " + arr[result]);    // Now, because result is an index, you can retrieve the actual value from the original array
        System.out.println("Its index: " + result);     
    
    }
    static int findNextLargest (int[] arr){

        int max = arr[0];                       // I will assume that the first element in the array is the MAX

        for (int i=0; i <arr.length; i++){
            if (arr[i] > max){
                max = arr[i];                   // Here we have found the first element
            }
        } 

        int secondMax = Integer.MIN_VALUE;      // -214 748     -2³¹
        int secondMaxIndex = -1;

        for (int i=0; i<arr.length; i++){
            if (arr[i] < max && arr[i] > secondMax){                  // Note this approach works assuming there is a second largesr number , and no duplicates.
                secondMax = arr[i];                                   // return VALUE
                secondMaxIndex = i;                                   // Return the INDEX of the next largest number
            }
        }
    return secondMaxIndex;        // That is the only value the method returns. secondMax is used internally to help find the correct index.
    }   
}
