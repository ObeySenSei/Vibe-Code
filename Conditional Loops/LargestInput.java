// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestInput {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      System.out.println("Enter your numbers (enter 0 to stop): ");

      int num;
      int largest = 0;

      while (true){
        num = in.nextInt();
      if ( num==0){
           break;
        }
      if (num > largest )
        largest = num;        //  We want the largest variable to take the new bigger number.
       }
    System.out.println("The largest number is: " + largest);
    in.close();
    }
}

//num      = new number that just arrived
//largest  = largest number we have found so far
