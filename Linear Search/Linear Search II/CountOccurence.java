/*
Q3. Count occurrences
Count how many times a given target appears in an array. Test with {1, 3, 3, 5, 3, 7} and target 3.
*/
public class CountOccurence {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 3, 5, 3, 7};
        int target = 3;

        int result = findOcuurence (arr, target);
        System.out.println(target + " appears " + result + " time(s) in the array." );
    }
    static int findOcuurence ( int[] arr, int target){

        int count = 0;

        for (int i=0; i<arr.length; i++){
            if ( arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
