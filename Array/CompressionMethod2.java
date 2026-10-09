import java.util.Arrays;

public class CompressionMethod2 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 4, 4, 4, 4};
        int[] result = compress(arr);
        System.out.println("The resultant array is: " + Arrays.toString(result));
    }

    static int[] compress(int[] arr) {

        // Count how many groups exist
        int group = 1;

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] != arr[j + 1]) {
                group++;
            }
        }

        // Each group needs 2 positions: value + count
        int[] newArr = new int[group * 2];

        int index = 0;
        int start = 0;

        // Process each group
        for (int j = 0; j < arr.length - 1; j++) {

            if (arr[j] != arr[j + 1]) {

                int count = j - start + 1;        // count when =

                newArr[index] = arr[start];
                newArr[index + 1] = count;

                index += 2;
                start = j + 1;
            }
        }

        // Process the final group
        int count = arr.length - start;

        newArr[index] = arr[start];
        newArr[index + 1] = count;

        return newArr;
    }
}