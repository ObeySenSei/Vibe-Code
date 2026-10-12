/*
Q5. Find the maximum element and the index of its first occurrence in {4, 9, 2, 9, 6}.
*/
public class LargestElementIndex {
    public static void main(String[] args) {

        int[] arr = {4, 9, 2, 9, 6};
        int target = 9;

        int max = findMaxElement(arr);
        int firstIndex = firstIndex(arr,target);
        System.out.println("The largest element in the array: " + max);
        System.out.println("The index of the largest element: " + firstIndex);
        
    }
    static int findMaxElement (int[] arr){

        int max = Integer.MIN_VALUE;   // or we can use     int max = arr[0]

        for (int i=1; i<arr.length; i++){                       //  Notice that we start at index 1 because arr[0] is already our initial maximum.  
            if (arr[i] > max){
                max = arr[i];
            }            
        }
        return max;
    }
    static int firstIndex (int[] arr, int target){

        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    } 
}
/* 
If you want to do it in a single method 

public class LargestElementIndex {
    public static void main(String[] args) {

        int[] arr = {4, 9, 2, 9, 6};

        findLargestAndIndex(arr);
    }

    static void findLargestAndIndex(int[] arr) {

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("First occurrence index: " + maxIndex);
    }
}
*/