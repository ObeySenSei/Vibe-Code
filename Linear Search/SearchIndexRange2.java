public class SearchIndexRange2 {
    
public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int result = linearSearch(arr, 60, 2, 6);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target, int start, int end) {

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;         // no value exists
    } 
}

