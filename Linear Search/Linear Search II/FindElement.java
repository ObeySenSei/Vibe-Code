/* Q1. Find an element
Given an array {5, 2, 8, 7, 3, 10} and a target 7, return its index. If the target doesn't exist, return -1. */
public class FindElement {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 7, 3, 10};
        int target = 7;

        int index = findIndex(arr,target);
        System.out.println("The index of the target element is: " + index);

    }
    static int findIndex (int[] arr, int target) {

        for (int i=0; i<arr.length; i++){
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
