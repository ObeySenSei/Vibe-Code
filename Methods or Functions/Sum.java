package MethodsorFunctions;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

        sum();                 // Function call
        int ans = sum2();      // Function call
        System.out.println("Returned sum is: " + ans);
    }
    static void sum() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of the two numbers is: " + sum);
    }
    static int sum2() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        int sum2 = num1 + num2;

        return sum2;
    }
}