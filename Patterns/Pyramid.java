/*

    *
   ***
  *****
 *******
*********

*/

public class Pyramid {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {

            // Print spaces
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

    

