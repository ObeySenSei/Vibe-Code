import java.util.Arrays;
import java.util.Scanner;
public class InputArr {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter 5 values: ");
        int arr [] = new int [5];
        
        // Take input 5 times 
        for ( int i=0; i<arr.length; i++ ) {
            arr[i] = in.nextInt();
        }
        
        // Print those 5 integers  
        for ( int i=0; i<arr.length; i++) {
            System.out.print ( arr[i] + " ");
        }

        System.out.println(Arrays.toString(arr));               // Better way of printing arrays
    }   
}
