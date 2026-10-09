// The program finds the largest number within a specific range of an array

public class MaxArrayValue {

    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 55};

        System.out.println(maxNum(arr, 1, 3));           // Find the maximum value from index 1 through index 3
        System.out.println(maxNum(arr, 0, arr.length - 1 ));      // Find the max value in the whole array
    }

    static int maxNum(int[] arr, int start, int end) {

        int maxVal = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        return maxVal;
    }
}