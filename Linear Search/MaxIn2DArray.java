public class MaxIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9, 12},
            {10, 11}
        };
        int ans = search2D(arr);
        System.out.println("The max value in the array is: " + ans);

    }
    static int search2D (int[][] arr){

        int max = Integer.MIN_VALUE;        // Integer.MIN_VALUE ensures that even if all the numbers are negative, your algorithm can still find the maximum correctly.

        for (int row=0; row < arr.length; row++){
            for (int col=0; col < arr[row].length; col++){     // column that than the length of THAT particular row
                if (arr[row][col] > max ){
                    max = arr [row][col];
                }
            }
        }
        return max;
    }
    
}

// We can also use int max = arr[0][0];  Integer.MIN_VALUE is the smallest possible Java int.  -2147483648
