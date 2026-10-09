import  java.util.Scanner;
public class EquilateralTriangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side of the triangle: ");
        double side = in.nextDouble();

        double halfBase = side / 2;           // The height divides the base into two equal parts

        // Using Pythagoras:
        // side² = halfBase² + height²
        double height = Math.sqrt((side * side) - (halfBase * halfBase));              // height = √(6² - 3²)

        // Area = 1/2 × base × height
        double area = 0.5 * side * height;                                             // area of a  triangle = 1/2 × base × height

        System.out.println("Height of the Equilateral Triangle is: " + height);
        System.out.println("Area of the Equilateral Triangle is: " + area);

        in.close();
    }
}

