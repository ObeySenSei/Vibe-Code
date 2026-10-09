/*A factorial means Multiply a number by every positive whole number below it, all the way down to 1.
5! = 5*4*3*2*1
So 5! = 120 
*/
import java.util.Scanner;;
public class Factorial {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        System.out.println("Enter your number : ");
        int num = in.nextInt();
        
        int factorial = 1;

        for (int i=1; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);

        in.close();
    }   
}
