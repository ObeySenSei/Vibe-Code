import java.util.Arrays;

public class Declare {
    public static void main(String[] args) {
        /*  
        int[] roll;                   1. Declaration
        roll = new int[5];            2. Creation of the array   */

        int roll [] = new int [5];
        
        roll[0] = 23;
        roll[1] = 24;
        roll[2] = 25;
        roll[3] = 26;
        roll[4] = 27;

        System.out.println("Value at index 0: " + roll[0]);


     // Another way of creating and initializing an array

        int[] roll2 = {1, 2, 3, 4, 5};

        System.out.println("Roll2: " + Arrays.toString(roll2));

        // Print values individually using a loop
        for (int i = 0; i < roll2.length; i++) {
            System.out.println("Value at Index " + i + ": " + roll2[i]);
        }
    }
}