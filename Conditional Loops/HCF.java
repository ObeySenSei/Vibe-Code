import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = in.nextInt();

        System.out.println("Enter second number:");
        int num2 = in.nextInt();

        int hcf = 1;
        
        for (int i=1; i <= num1 && i<=num2; i++){
            if ( num1 % i == 0 && num2 % i == 0 ){
                hcf = i; 
            }
        }
    System.out.println("HCF = " + hcf);
    in.close();
    }
}