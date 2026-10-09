import java.util.Scanner;
public class ProductFunction {

    public static void main(String[] args) {
        
      Scanner in = new Scanner(System.in);

        System.out.println("Enter first num: ");
        int num1 = in.nextInt();
        System.out.println("Enter second num: ");
        int num2 = in.nextInt();

        int ans = multiply(num1,num2);
        System.out.println("The product of the two numbers is: " + ans);

}

    static int multiply (int a, int b){
        int product = a * b;
        return product;
    }
}
