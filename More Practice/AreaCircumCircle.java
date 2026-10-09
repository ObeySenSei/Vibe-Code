// Write a Java program that asks the user to enter the radius of a circle. 
// Define separate methods to calculate and return the circle's area and circumference, then display both results.

import java.util.Scanner;

public class AreaCircumCircle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        int radius = in.nextInt();

        double area = calculateArea(radius);                          // Create a variable called 'area' and store the value returned by 'calculateArea', using radius.
        System.out.println("The area of the circle is: " + area);

        double circumference = calculateCircumference(radius);
        System.out.println("The circumference of the circle is: " + circumference);
    }

    static double calculateArea(int radius) {

        double area = Math.PI * radius * radius;
        return area;
    }

    static double calculateCircumference(int radius) {

        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}