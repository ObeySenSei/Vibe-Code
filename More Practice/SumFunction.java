import java.util.Scanner;
public class SumFunction {
    public static void main(String[] args) {
        Sum();        // First method call                                 

//With Parameters
   Scanner in = new Scanner(System.in);

        System.out.println("Enter first num: ");
        int num1 = in.nextInt();

        System.out.println("Enter second num: ");
        int num2 = in.nextInt();

        int ans = add(num1, num2);                 // Second method call        

        System.out.println("The sum is: " + ans);
    }

//  Pass by no parameters                    Argument = value/variable you provide when calling the method        Parameter = variable in the method definition
    static void Sum (){
        
        Scanner in = new Scanner (System.in);

        System.out.println( "Enter first num: ");
        int num1 = in.nextInt();
        System.out.println( "Enter second num: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
    }

// Pass by paramenters
    static int add (int a, int b){
        int sum = a + b;
        return sum;
    }
}
