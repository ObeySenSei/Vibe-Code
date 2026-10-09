import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

         Scanner in = new Scanner (System.in);

         System.out.println("Enter base: ");
         double base = in.nextDouble();

         System.out.println("Enter height: ");
         double height = in.nextDouble();

         double area = 0.5 * base * height;
          
    System.out.println("Area of the Triangle is: " + area);
        
    }
    
}
