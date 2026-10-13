public class P1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");      // prints stars on the same line
            }
            System.out.println();     // To move to the next line after printing five stars, use System.out.println();.
        }
    }
}


/* 
    *****
    *****
    *****
    *****
    *****

    Outer loop (i) runs 5 times — controls the rows.


Inner loop (j) runs 5 times — prints 5 stars in each row.
System out print["*" prints stars on the same line
System out println() moves to the next line after each row.



*/