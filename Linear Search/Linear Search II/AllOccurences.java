/*
Q4. Find all occurrences Return a new array containing every index where the target appears. Test with {6, 2, 6, 4, 6, 9} and target 6.
 */
import java.util.Arrays;
public class AllOccurences {
    public static void main(String[] args) {
        int[]arr = {6, 2, 6, 4, 6, 9};
        int target = 6;

        int[] ans = findOcuurence(arr, target);
        System.out.println("Indices of " + target + " in the array: " + " are: " + Arrays.toString(ans));
        
    }
    static int[] findOcuurence (int[] arr, int target) {

        int occurence = 0;

        for (int i=0; i<arr.length; i++){         // to count the number of appearance
            if (arr[i] == target ){
                occurence++;
            }
        }
        int[] result = new int [occurence];       // So basically here we are creating a new array with SIZE of OCCURENCE !!

      
    // To avoid overwriting the first slot, The solution is to : use a separate variable to track the next available position in the new ARRAY !

        int j = 0;                           
        
        for (int i=0; i<arr.length; i++){         // to store the indices
            if (arr[i] == target ){
                result[j] = i;                    // store the index of 6 in the first element in the new Array 'RESULT'.
                j++;
            }                                     // Now i tracks the original array, while j tracks the new array.
        }                                          
        return result;
    } 
}
