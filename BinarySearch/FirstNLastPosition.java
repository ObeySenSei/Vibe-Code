// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Return the indices of the first and last element , say 7.

import java.util.Arrays;

public class FirstNLastPosition {
    public static void main(String[] args) {

        int [] arr = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;

        int[] result = searchRange(arr, target);
        
        System.out.println("First position: " + result[0]);
        System.out.println("Last position: " + result[1]);

        // or
        System.out.println(Arrays.toString(result));
        
    }
    static int[] searchRange (int[] arr, int target){

        int[] position = {-1, -1};                  // Initially, lets assume the target does not exist.

        // check for first occurence of 7
        
        int start = searchIndex(arr, target, true);      // Find the first occurrence of the target.   That true tells the method: when you find 7, keep looking to the left.        Call the method and tell it to find the first occurrence of the target.
        int end = searchIndex(arr, target, false);      // Find the second occurrence of the target.   false tells the algorithm what to do after it finds the target. It doesn't determine the initial mid.

        position [0] = start;
        position [1] = end;

        return position;
    }
    
    static int searchIndex (int[] arr, int target, boolean findStartIndex){     // This function returns the index value of what we are trying to search (target)

        int ans = -1;     // Lets assume the target does not exist

        int start = 0;
        int end  = arr.length - 1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                ans = mid;         // Target found. Save its index as a potential answer.

                if (findStartIndex == true){   // we can remove  = true
                    end = mid - 1;            // Search the left half for an earlier occurrence.
                } else {
                    start = mid + 1;       // The loop continues searching to the right until it finds the last occurrence. Only when findStartIndex is false, this is executed.
                }
            }
        }
        return ans;
    }
}
/*

The first method coordinates the work. The second method performs binary search.

Java enters searchRange() and passes it two arguments:
- arr — the array.
- target — the value 7.

Step 2: searchRange() calls search() for the first time

int start = search(arr, target, true);
Think of this as saying:
Search this array for 7. When you find it, keep looking to the left.

Java enters search() with these parameter values:
arr = {5, 7, 7, 7, 8, 8, 10}
target = 7
findStartIndex = true

The method performs binary search, finds the first occurrence at index 1, and executes:
return ans;
The returned value is 1.

Java then resumes execution in searchRange():
int start = search(arr, target, true);
That variable named start in searchRange() now stores 1.
Notice: this start is a different variable from the start inside search(). They have the same name, but they belong to different method calls and have different scopes.


Step 3: searchRange() calls search() again
int end = search(arr, target, false);


Java enters search() again, with findStartIndex = false.
A new method call means fresh local variables.
int ans = -1;
int start = 0;
int end = arr.length - 1;


The second search starts from the beginning of the array again. This time, whenever it finds 7, it searches to the right.   **IMPORTANT**
Eventually, it returns 3.  THE INDEX POSITION
Back in searchRange():
int end = search(arr, target, false);


The variable named end in searchRange() stores 3.
ans is assigned to -

position[1] = end    i.e    position[1] = 7


One important distinction: The true argument does not mean start = true. 
It means the method's parameter findStartIndex receives the boolean value true.


*/