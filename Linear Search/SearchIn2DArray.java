import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9, 12},
            {10, 11}
        };

        int target = 12;                          // Currently its at [2][3] i.e 3rd row, 4th column.
        int[] ans = search2D(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search2D(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {   // Each rows have different lengths: the 3rd row has 4 elements, while the last row has only 2.

                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
