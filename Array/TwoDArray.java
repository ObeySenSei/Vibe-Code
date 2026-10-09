import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];                                // Create a 2D array with 3 rows and 3 columns

        System.out.println("Enter 9 elements:");

        //Input
        for (int row = 0; row < arr.length; row++) {                // Keep going while row is smaller than the number of rows

            for (int j = 0; j < arr[row].length; j++) {             // for each column in every row The variable j is basically a Column and j keeps going while 
                arr[row][j] = in.nextInt();                         //                  column is smaller than the number of rows.
            }
        }

        
        System.out.println("\nElements in the array: ");              //Output

        for (int row = 0; row < arr.length; row++) {

            for (int j = 0; j< arr[row].length; j++) {
                System.out.print(arr[row][j] + " ");
            }

            System.out.println();                                                 // Move to the next line after each row
        }
        
        System.out.println("Element at row 1, column 2: " + arr[1][2]);           // To Access a particular element
        in.close();
    }
}