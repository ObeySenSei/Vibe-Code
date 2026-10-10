// Search for element 4 in the index range of 2 to 6.
public class SearchIndexRange {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8};
        
        int ans = linearSearch(arr, 4);                                // or we can write int target = 4;
        System.out.println("The element 4 is present at index: " + ans);

    }
    static int linearSearch (int[] arr, int target){

        for (int i=2; i<7; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
}
