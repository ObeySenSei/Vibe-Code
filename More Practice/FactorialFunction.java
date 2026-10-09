// Write a program to print the factorial of a number by defining a method named 'Factorial'. 

import java.util.Scanner;
public class FactorialFunction {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        System.out.println("Enter your number : ");
        int num = in.nextInt();

        int factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);

    }

    static int calculateFactorial (int a) {

        int sum = 1;

        for (int i=1; i<=a; i++){
            sum = sum * i;
        }
        return sum;
    }
}
