//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class InputName {

    public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);
    System.out.println("Enter a name: ");
    String name = in.nextLine();   // If you want to accept a full name, use in.nextLine() instead of in.next() 

    System.out.println("Hi " + name);

    in.close();
    }
}
