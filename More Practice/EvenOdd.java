// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num < 1) {
            System.out.println("Enter a valid number.");
        } else if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        in.close();  //  in.close(); closes the Scanner after you're finished taking input.
    }
}