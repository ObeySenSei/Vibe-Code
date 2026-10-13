public class ReverseSpacePyramid {
    public static void main(String[] args) {
        
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=1; j <= 6 - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}


/*

     * * * * *
      * * * *
       * * *
        * *
         *

for (int j = 0; j < 5 - i; j++)

Since i = 0, the condition becomes j < 5.
- j = 0: 0 < 5 → prints star 1.
- j = 1: 1 < 5 → prints star 2.
- j = 2: 2 < 5 → prints star 3.
- j = 3: 3 < 5 → prints star 4.
- j = 4: 4 < 5 → prints star 5.
- j = 5: 5 < 5 → false, stops.

*/
