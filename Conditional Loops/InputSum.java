// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;
public class InputSum {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      System.out.println("Enter your numbers (enter 0 to stop): ");
      int num;
      int sum = 0;
    
      while (true) {
        num = in.nextInt();
        if (num==0){
            break;
        }
        sum = sum + num;    
       }

       System.out.println("The sum of all your numbers: "+ sum);
       in.close();
    }
}
