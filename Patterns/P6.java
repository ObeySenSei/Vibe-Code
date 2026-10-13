/*  Right Sided Triangle
      *
     **
    ***
   ****
  *****

*/
public class P6 {
    public static void main(String[] args) {

        for (int i=0; i<5; i++){                      // loop to print the empty reverse half
            for (int j=i; j<4; j++){
                System.out.print("  ");
            }

            // Print stars
            for ( int j=0; j<=i; j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
            
        }
    }

