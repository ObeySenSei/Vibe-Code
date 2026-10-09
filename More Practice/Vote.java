// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;
public class Vote {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println( "Enter your age: ");
        int age = in.nextInt();
        
    if (isEligible(age)){
        System.out.println("You are eligible to Vote !");
    } else {
        System.out.println("You are not eligible to Vote !");
    }

    isEligibility(age);                                              // Second method call i.e in line 30 !!!

    }
    static boolean isEligible (int age){

         if (age >= 18){
            return true;
        } else {
            return false;
            }
    }

    static void isEligibility (int age){

        if (age >= 18){
            System.out.println("You are eligible to Vote!");
        } else {
            System.out.println("You are not eligible to vote! ");
        }
    }

}
