import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num = in.nextInt();

     System.out.println("The factors of "+num+ "are: ");

    for ( int i=1; i <= num; i++ ){
          if ( num % i == 0){
            System.out.println(i);
          }
    }
    in.close();
    }
    
}
