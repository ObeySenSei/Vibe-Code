import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // ==============================
        // Method 1: Using max = a
        // ==============================

        System.out.println("Enter first number: ");
        int a = in.nextInt();

        System.out.println("Enter second number: ");
        int b = in.nextInt();

        System.out.println("Enter third number: ");
        int c = in.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("The largest number is: " + max);


        // ==============================
        // Method 2: Using a > b first
        // ==============================

        System.out.println("\nEnter first number: ");
        int x = in.nextInt();

        System.out.println("Enter second number: ");
        int y = in.nextInt();

        System.out.println("Enter third number: ");
        int z = in.nextInt();

        int max2;

        if (x > y) {
            max2 = x;
        } else {
            max2 = y;
        }

        if (z > max2) {
            max2 = z;
        }

        System.out.println("The largest number is: " + max2);
    }
}