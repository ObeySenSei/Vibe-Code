import java.util.Arrays;

public class ReturnNewArray1 {
    public static void main(String[] args) {

        int arr[] = {-4, 7, -2, 10, 0, -8, 3};
        int[] result = newArray(arr);
        System.out.println("The resultant Array is: " + Arrays.toString(result));
        
    }
static boolean isPositive (int n){

        if ( n <= 0 ){
            return false;
        }
        return true;
    }


static int[] newArray ( int[] arr) {
    
    int arrSize = 0;                     // First we calculate the size of the array
    
    for (int i=0; i<arr.length; i++){
        if (isPositive(arr[i])){
            arrSize++;
        }
    }

    int[] newArr = new int [arrSize];         // Then we create our new array in which all the Positive Values will be stored
    int index = 0;                            // the index of the next available position in the new array
                                              
    for (int j=0; j<arr.length; j++){      // where the positive value will be assigned
            if (isPositive(arr[j])){
            newArr[index] = arr[j];         // newArr[index] basically means the VALUE AT O will be 7.
            index++;
            } 
        }
        return newArr;
    }  
}

/*

j identifies the current value being tested; index identifies the next available position
in the new array where that value will be assigned if the boolean method returns true.

*/