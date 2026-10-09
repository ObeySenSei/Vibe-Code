// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class IfOperator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.print("Enter your mode of operation (+, -, *, /): ");
        char ch = in.next().charAt(0);

        int ans;

       if (ch == '+') {
          ans = num1 + num2;
        } 
        else if (ch == '-') {
          ans = num1 - num2;
        } 
        else if (ch == '*') {
          ans = num1 * num2;
        } 
        else if (ch == '/') {
          ans = num1 / num2;
        } 
        else {
        System.out.println("Invalid operation!");
        in.close();
        return;
        }

    System.out.println("The result is: " + ans);
    in.close();
    }
}