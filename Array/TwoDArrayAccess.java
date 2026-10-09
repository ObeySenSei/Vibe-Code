import java.util.Scanner;

public class TwoDArrayAccess {

    public static void main(String[] args) {

        int[][] arr = {                     // int [][] arr = { {1,2,3},{4,5,6},{7,8,9}};
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int row, column;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter row indice: ");
        row = in.nextInt();

        System.out.print("Enter column indice: ");
        column = in.nextInt();

        System.out.println("Element at row " + row + " column " + column + " is " + arr[row][column]);      // For a 2D array, accessing an element is simply: 
                                                                                                            
        in.close();                                                                                         //                arr[row][column]
    }
}