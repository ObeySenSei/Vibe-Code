import java.util.Scanner;
public class PrimeNoMethod {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("Enter first number: ");
        int a = in.nextInt();     
        
        System.out.println("Enter second number: ");
        int b = in.nextInt();     
        
        System.out.println("The prime numbers between " + a + " and " + b + " are: ");
        printPrimes(a,b);
    }

    static void printPrimes (int start, int end){

        for ( int i=start; i<=end; i++ ){

             boolean isPrime = true;
        
        if (i < 2){
            isPrime = false;
        }     

             for (int j=2; j<i; j++){
                if ( i % j == 0 ) {
                    isPrime = false;
                    break;
                }
             }

             if ( isPrime){
                System.out.println(i);
             }
        }
    }
}