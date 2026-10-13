// Shift Method

import java.util.Arrays;

public class InsertionSort2 {
    public static void main(String[] args) {
        
        int[] arr = {5, 3, 4, 1, 2};
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    static void insertionSort (int[] arr){

        for (int i=1; i <arr.length; i++){

            // Index has been set to 1, i.e 3..........and CURRENT value = arr[i] i.e 3
            int current = arr[i];
            int j = i-1;                        // j = 0 index 0;

            while (j >= 0 && arr[j] > current){    // Index > 0 cannot go to -1 ;  So if arr[j] i.e   5 > 3   
                arr[j+1] = arr[j];                 //   3 becomes 5;
                j--;
            }
            arr[j+1] = current;                    // 3 is restored in index 0.    
        }
    }
}
