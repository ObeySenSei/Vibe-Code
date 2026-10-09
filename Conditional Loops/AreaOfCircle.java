import java.util.Scanner;
public class AreaOfCircle {
 public static void main(String[] args) {
    Scanner in = new Scanner (System.in);

    System.out.println("Enter radius: ");
    double radius = in.nextDouble();

    double area = Math.PI * radius * radius;                    // Math.PI = 3.14       
    System.out.println("The area of the circle is: " + area);
 }
    
}
