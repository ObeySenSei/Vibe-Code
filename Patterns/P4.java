/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/
public class P4 {
    public static void main(String[] args) {
        
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){   // row and column elements are same !
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
