public class MinArrayValue {
     public static void main(String[] args) {
        
        int[] arr = {87,23,64,32,10,45};

        System.out.println(minNum(arr,1,4));
        System.out.println(minNum(arr,0, arr.length - 1));
     }
    
    static int minNum ( int[] arr, int start, int end){

        int minValue = arr [start];                               // If you call: minNum(arr, 1, 4); then:   start = 1   end = 4
       
        for (int i = start; i <= end; i++){

            if (arr[i] < minValue ){                                // Is the current array value smaller than the smallest value I've found so far?
                minValue = arr[i];
            }            
        }
        return minValue;
    }
}
