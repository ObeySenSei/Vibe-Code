// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter Principal: ");
        int principal = in.nextInt();
        
        System.out.println("Enter Time: ");
        int time = in.nextInt();

        System.out.println("Enter Rate: ");
        int rate = in.nextInt();
    
    int Interest = (principal * rate * time)/ 100;
    System.out.println("Simple Interest is: "+ Interest);
    System.out.println("The total money earned or owned is: "+ Interest + principal);


    in.close();
    }
}


