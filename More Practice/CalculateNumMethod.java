import java.util.Scanner;
public class CalculateNumMethod {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();

        int totalNum = calculateTotalNum (num);
        System.out.println("The total numbers in "+ num + " is: " + totalNum); 

    }
    static int calculateTotalNum (int a){

        int count = 0;

        while (a > 0){
 
            int digit = a % 10;               // Extract the last digit, lets say 1234
            count++; 
            a = a / 10;               // Increment count outside the while loop
        } 
        return count;                   
    }
    
}
