/*
Q2. Find the first occurrence
Given {4, 2, 7, 2, 9, 2}, find the index of the first occurrence of 2.
 */
package String;
public class LastOccurence {
    public static void main(String[] args) {
        
        int[] arr = {4, 2, 7, 2, 9, 2};
        int target = 2;

        int index = lastOccurence(arr,target);
        System.out.println("The index of the first occurence of " + target + " is: " + index);

    }
    static int lastOccurence (int[] arr, int target){         // basically start from the last index.

        for (int i=arr.length-1; i>=0; i--){
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
    

