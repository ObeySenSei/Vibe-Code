//Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
       
        System.out.println("Enter second number: ");
        int num2 = in.nextInt();


        if (num1 > num2) {
            System.out.println("The larger number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The larger number is: " + num2);
        } else {
             System.out.println("Both the numbers are equal");
        }

        in.close();

    }
    
}