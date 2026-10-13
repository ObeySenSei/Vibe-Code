/* Inverted right-angled triangle pattern
    *****
    ****
    ***
    **
    *
*/
public class P3 {    
    public static void main(String[] args) {
        
        for (int row=1; row<=5; row++){                // There are 5 rows so, row has to be printed 5 times
            for (int col=row; col <= 5 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Formula is  COLUMN = ROW + 1  - i
