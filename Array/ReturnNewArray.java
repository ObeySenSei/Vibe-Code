import java.util.Arrays;

public class ReturnNewArray {
    public static void main(String[] args) {

        int[] numbers  = {5, 2, 8, 7, 3, 10};

        int[] modifiedArr = filterEven(numbers);
        System.out.println("The newly modified Array is: " + Arrays.toString(modifiedArr));
        
    }

    static boolean isEven (int n){      // Method to check if a Number N is Even

            if ( n % 2 == 0){           // or we can write  " return n % 2 == 0; "
            return true;
            }
        return false;
    }

    static int[] filterEven ( int[] numbers){   // Here we are creating a new integer array and passing the orginal array as parameter
        
    int arraySize = 0;                      // Step 1: Count the Even Numbers !
        
        for (int i=0; i<numbers.length; i++){

            if (isEven(numbers[i])){            // Take the element at index i and ask isEven() if its an Even Number  
                arraySize ++;                   // We have now found the total no. of elements
            }
        }
            
        int[] arr = new int[arraySize] ;        // Step 2: Create that int[] of size arraySize. We have an empty: arr = {0, 0, 0}
        
        int j=0;                               // j is the index of the next available position in the new array where an even value — confirmed by the isEven() method call—will be assigned.

        for ( int i=0; i<numbers.length; i++){

            if (isEven(numbers[i])){
            arr[j]=numbers[i];
            j++;
           }
       }     
        return arr;       
    }
}

    